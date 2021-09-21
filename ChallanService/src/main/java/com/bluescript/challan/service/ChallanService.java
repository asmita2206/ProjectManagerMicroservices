package com.bluescript.challan.service;

import com.bluescript.challan.constants.StringConstants;
import com.bluescript.challan.entity.ChallanEntity;
import com.bluescript.challan.exception.NoRecordFoundException;
import com.bluescript.challan.repository.ChallanRepo;
import com.bluescript.challan.request.ChallanRequest;
import com.bluescript.challan.response.ChallanDeleteResponse;
import com.bluescript.challan.utils.ChallanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallanService {

    @Autowired
    ChallanRepo challanRepo;

    public ChallanEntity createChallan(ChallanRequest challanRequest) {

        String challanId= ChallanUtils.generateId(StringConstants.challanId_prefix);
        ChallanEntity challanEntity=new ChallanEntity();

        challanEntity.setChallanId(challanId);
        challanEntity.setInventoryId(challanRequest.getInventoryId());
        challanEntity.setProjectId(challanRequest.getProjectId());
        challanEntity.setPurchaseOrderId(challanRequest.getPurchaseOrderId());
        challanEntity.setReceiverId(challanRequest.getReceiverId());
        challanEntity.setSubChallanNumber(challanRequest.getSubChallanNumber());
        challanEntity.setTransportationId(challanRequest.getTransportationId());

        return challanRepo.save(challanEntity);
    }

    public ChallanEntity getChallan(String challanId) {

        ChallanEntity challanEntity=challanRepo.findBychallanId(challanId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +challanId);
        });
        return challanEntity;
    }

    public ChallanDeleteResponse deleteChallan(String challanId) {

        ChallanEntity challanEntity=challanRepo.findBychallanId(challanId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +challanId);
        });
        ChallanDeleteResponse deleteResponse=new ChallanDeleteResponse(challanId,true);
        challanRepo.delete(challanEntity);

        return deleteResponse;
    }

    public ChallanEntity updateChallan(String challanId, ChallanRequest challanRequest) {

        ChallanEntity challanEntity=challanRepo.findBychallanId(challanId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +challanId);
        });

        challanEntity.getChallanId();
        challanEntity.setInventoryId(challanRequest.getInventoryId());
        challanEntity.setProjectId(challanRequest.getProjectId());
        challanEntity.setPurchaseOrderId(challanRequest.getPurchaseOrderId());
        challanEntity.setReceiverId(challanRequest.getReceiverId());
        challanEntity.setSubChallanNumber(challanRequest.getSubChallanNumber());
        challanEntity.setTransportationId(challanRequest.getTransportationId());

        return challanRepo.save(challanEntity);

    }
}
