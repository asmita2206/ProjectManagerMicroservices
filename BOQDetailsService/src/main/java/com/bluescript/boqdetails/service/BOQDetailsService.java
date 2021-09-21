package com.bluescript.boqdetails.service;

import com.bluescript.boqdetails.entity.BOQDetailsEntity;
import com.bluescript.boqdetails.exception.NoRecordFoundException;
import com.bluescript.boqdetails.repository.BOQDetailsRepo;
import com.bluescript.boqdetails.request.BOQDetailsRequest;
import com.bluescript.boqdetails.response.BOQDetailsDeleteResponse;
import com.bluescript.boqdetails.utils.BoqDetailsUtils;
import com.bluescript.boqdetails.constants.StringConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BOQDetailsService {

    @Autowired
    BOQDetailsRepo boqDetailsRepo;

    public BOQDetailsEntity createBOQ(BOQDetailsRequest boqDetailsRequest) {

     String boqId= BoqDetailsUtils.generateId(StringConstants.boqId_prefix);
     String projectId=BoqDetailsUtils.generateId(StringConstants.projectId_prefix);
     String poDetailsId=BoqDetailsUtils.generateId(StringConstants.projectId_prefix);
     String inventoryDetailsId=BoqDetailsUtils.generateId(StringConstants.inventoryDetailsId_prefix);
     String boqHeaderId=BoqDetailsUtils.generateId(StringConstants.boqHeaderId_prefix);
     BOQDetailsEntity boqDetailsEntity=new BOQDetailsEntity();
     boqDetailsEntity.setBoqHeaderId(boqHeaderId);
     boqDetailsEntity.setBoqId(boqId);
     boqDetailsEntity.setInventoryDetailsId(inventoryDetailsId);
     boqDetailsEntity.setProjectId(projectId);
     boqDetailsEntity.setPoDetailsId(poDetailsId);
     boqDetailsEntity.setVersionNumber(boqDetailsRequest.getVersionNumber());

     return boqDetailsRepo.save(boqDetailsEntity);
    }

    public BOQDetailsEntity getBOQ(String boqId) {
        BOQDetailsEntity boqDetailsEntity=boqDetailsRepo.findByboqId(boqId).orElseThrow(()->{
            return new NoRecordFoundException("NO_RECORD_FOUND :" +boqId);
        });
        return boqDetailsEntity;
    }

    public BOQDetailsDeleteResponse deleteBOQ(String boqId) {
        BOQDetailsEntity boqDetailsEntity=boqDetailsRepo.findByboqId(boqId).orElseThrow(()->{
            return new NoRecordFoundException("NO_RECORD_FOUND :" +boqId);
        });
        BOQDetailsDeleteResponse boqDetailsDeleteResponse=new BOQDetailsDeleteResponse(boqId,true);
        boqDetailsRepo.delete(boqDetailsEntity);
        return boqDetailsDeleteResponse;
    }

    public BOQDetailsEntity updateBOQ(String boqId,BOQDetailsRequest boqDetailsRequest) {
        BOQDetailsEntity boqDetailsEntity=boqDetailsRepo.findByboqId(boqId).orElseThrow(()->{
            return new NoRecordFoundException("NO_RECORD_FOUND :" +boqId);
        });
        boqDetailsEntity.getBoqHeaderId();
        boqDetailsEntity.getBoqId();
        boqDetailsEntity.getInventoryDetailsId();
        boqDetailsEntity.getPoDetailsId();
        boqDetailsEntity.getProjectId();
        boqDetailsEntity.setVersionNumber(boqDetailsRequest.getVersionNumber());
        return boqDetailsRepo.save(boqDetailsEntity);
    }
}
