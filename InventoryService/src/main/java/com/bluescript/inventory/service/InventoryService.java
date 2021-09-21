package com.bluescript.inventory.service;

import com.bluescript.inventory.constants.StringConstants;
import com.bluescript.inventory.entity.InventoryEntity;
import com.bluescript.inventory.exception.NoRecordFoundException;
import com.bluescript.inventory.repository.InventoryRepo;
import com.bluescript.inventory.request.InventoryRequest;
import com.bluescript.inventory.response.InventoryDeleteResponse;
import com.bluescript.inventory.utils.InventoryUtils;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    InventoryRepo inventoryRepo;

    public InventoryEntity createInventory(InventoryRequest inventoryRequest) {

        String inventoryId= InventoryUtils.generateId(StringConstants.inventoryId_prefix);
        InventoryEntity inventoryEntity=new InventoryEntity();
        inventoryEntity.setInventoryId(inventoryId);
        inventoryEntity.setChallanId(inventoryRequest.getChallanId());
        inventoryEntity.setInventoryEntryId(inventoryRequest.getInventoryEntryId());
        inventoryEntity.setPurchaseOrderId(inventoryRequest.getPurchaseOrderId());
        inventoryEntity.setReceivedDate(inventoryRequest.getReceivedDate());

        return inventoryRepo.save(inventoryEntity);
    }

    public InventoryEntity getInventory(String inventoryId) {

        InventoryEntity inventoryEntity=inventoryRepo.findByinventoryId(inventoryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inventoryId);
        });

        return inventoryEntity;
    }

    public InventoryDeleteResponse deleteInventory(String inventoryId) {

        InventoryEntity inventoryEntity=inventoryRepo.findByinventoryId(inventoryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inventoryId);
        });
        InventoryDeleteResponse deleteResponse=new InventoryDeleteResponse(inventoryId,true);
        inventoryRepo.delete(inventoryEntity);

        return deleteResponse;
    }

    public InventoryEntity updateInventory(String inventoryId,InventoryRequest inventoryRequest) {

        InventoryEntity inventoryEntity=inventoryRepo.findByinventoryId(inventoryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inventoryId);
        });

        inventoryEntity.getInventoryId();
        inventoryEntity.setChallanId(inventoryRequest.getChallanId());
        inventoryEntity.setInventoryEntryId(inventoryRequest.getInventoryEntryId());
        inventoryEntity.setPurchaseOrderId(inventoryRequest.getPurchaseOrderId());
        inventoryEntity.setReceivedDate(inventoryRequest.getReceivedDate());

        return inventoryRepo.save(inventoryEntity);
    }
}
