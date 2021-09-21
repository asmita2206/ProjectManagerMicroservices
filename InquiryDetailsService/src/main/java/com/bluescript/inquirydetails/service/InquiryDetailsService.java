package com.bluescript.inquirydetails.service;

import com.bluescript.inquirydetails.constants.StringConstants;
import com.bluescript.inquirydetails.entity.InquiryDetailsEntity;
import com.bluescript.inquirydetails.exception.NoRecordFoundException;
import com.bluescript.inquirydetails.repository.InquiryDetailsRepo;
import com.bluescript.inquirydetails.request.InquiryDetailsRequest;
import com.bluescript.inquirydetails.response.InquiryDetailsDeleteResponse;
import com.bluescript.inquirydetails.utils.InquiryDetailsUtils;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryDetailsService {

    @Autowired
    InquiryDetailsRepo inquiryDetailsRepo;

    public InquiryDetailsEntity createInquiry(InquiryDetailsRequest inquiryDetailsRequest) {

        String inquiryId= InquiryDetailsUtils.generateId(StringConstants.inquiryId_prefix);
        InquiryDetailsEntity inquiryDetailsEntity=new InquiryDetailsEntity();
        inquiryDetailsEntity.setInquiryId(inquiryId);
        inquiryDetailsEntity.setBOQId(inquiryDetailsRequest.getBOQId());
        inquiryDetailsEntity.setInventoryDetailsId(inquiryDetailsRequest.getInventoryDetailsId());
        inquiryDetailsEntity.setVendorId(inquiryDetailsRequest.getVendorId());

        return inquiryDetailsRepo.save(inquiryDetailsEntity);
    }

    public InquiryDetailsEntity getInquiry(String inquiryId) {

        InquiryDetailsEntity inquiryDetailsEntity=inquiryDetailsRepo.findByinquiryId(inquiryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inquiryId);
        });

        return inquiryDetailsEntity;
    }

    public InquiryDetailsDeleteResponse deleteInquiry(String inquiryId) {

        InquiryDetailsEntity inquiryDetailsEntity =inquiryDetailsRepo.findByinquiryId(inquiryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inquiryId);
        });

        InquiryDetailsDeleteResponse inquiryDetailsDeleteResponse=new InquiryDetailsDeleteResponse(inquiryId,true);
        inquiryDetailsRepo.delete(inquiryDetailsEntity);
        return inquiryDetailsDeleteResponse;

    }

    public InquiryDetailsEntity updateInquiry(String inquiryId, InquiryDetailsRequest inquiryDetailsRequest) {

        InquiryDetailsEntity inquiryDetailsEntity=inquiryDetailsRepo.findByinquiryId(inquiryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inquiryId);
        });

        inquiryDetailsEntity.getInquiryId();
        inquiryDetailsEntity.setVendorId(inquiryDetailsRequest.getVendorId());
        inquiryDetailsEntity.setInventoryDetailsId(inquiryDetailsRequest.getInventoryDetailsId());
        inquiryDetailsEntity.setBOQId(inquiryDetailsRequest.getBOQId());

        return inquiryDetailsRepo.save(inquiryDetailsEntity);
    }
}
