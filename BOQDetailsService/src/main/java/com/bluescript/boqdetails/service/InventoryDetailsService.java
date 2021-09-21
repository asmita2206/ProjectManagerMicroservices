package com.bluescript.boqdetails.service;

import com.bluescript.boqdetails.entity.InventoryDetailsEntity;
import com.bluescript.boqdetails.exception.NoRecordFoundException;
import com.bluescript.boqdetails.repository.InventoryDetailsRepo;
import com.bluescript.boqdetails.request.InventoryDetailsRequest;
import com.bluescript.boqdetails.response.InventoryDetailsDeleteResponse;
import com.bluescript.boqdetails.utils.BoqDetailsUtils;
import com.bluescript.boqdetails.constants.StringConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryDetailsService {

    @Autowired
    InventoryDetailsRepo inventoryDetailsRepo;

    public InventoryDetailsEntity createInventoryDetails(InventoryDetailsRequest inventoryDetailsRequest) {

        String inventoryDetailsId= BoqDetailsUtils.generateId(StringConstants.inventoryDetailsId_prefix);
        String productDefinitionId=BoqDetailsUtils.generateId(StringConstants.productDefinitionId_prefix);
        String ratesId=BoqDetailsUtils.generateId(StringConstants.ratesId_prefix);

        InventoryDetailsEntity inventoryDetailsEntity=new InventoryDetailsEntity();
        inventoryDetailsEntity.setInventoryDetailsId(inventoryDetailsId);
        inventoryDetailsEntity.setProductDefinitionId(productDefinitionId);
        inventoryDetailsEntity.setRatesId(ratesId);
        inventoryDetailsEntity.setQuantity(inventoryDetailsRequest.getQuantity());
        inventoryDetailsEntity.setSize(inventoryDetailsRequest.getSize());

        return inventoryDetailsRepo.save(inventoryDetailsEntity);

    }

    public InventoryDetailsEntity getInventoryDetails(String inventoryDetailsId) {

        InventoryDetailsEntity inventoryDetailsEntity=inventoryDetailsRepo.findByInventoryDetailsId(inventoryDetailsId).orElseThrow(()->{
            return new NoRecordFoundException("NO_Record_found :" +inventoryDetailsId);
        });

        return inventoryDetailsEntity;
    }

    public InventoryDetailsDeleteResponse deleteInventoryDetails(String inventoryDetailsId) {
        InventoryDetailsEntity inventoryDetailsEntity=inventoryDetailsRepo.findByInventoryDetailsId(inventoryDetailsId).orElseThrow(()->{
            return new NoRecordFoundException("NO_Record_found :" +inventoryDetailsId);
        });
        InventoryDetailsDeleteResponse inventoryDetailsDeleteResponse =new InventoryDetailsDeleteResponse(inventoryDetailsId,true);
        inventoryDetailsRepo.delete(inventoryDetailsEntity);

        return inventoryDetailsDeleteResponse;
    }

    public InventoryDetailsEntity updateInventoryDetails(String inventoryDetailsId, InventoryDetailsRequest inventoryDetailsRequest) {
        InventoryDetailsEntity inventoryDetailsEntity=inventoryDetailsRepo.findByInventoryDetailsId(inventoryDetailsId).orElseThrow(()->{
            return new NoRecordFoundException("NO_Record_found :" +inventoryDetailsId);
        });

        inventoryDetailsEntity.getInventoryDetailsId();
        inventoryDetailsEntity.getProductDefinitionId();
        inventoryDetailsEntity.getRatesId();
        inventoryDetailsEntity.setSize(inventoryDetailsRequest.getSize());
        inventoryDetailsEntity.setQuantity(inventoryDetailsRequest.getQuantity());

        return inventoryDetailsRepo.save(inventoryDetailsEntity);
    }
}
