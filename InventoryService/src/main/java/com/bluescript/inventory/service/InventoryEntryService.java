package com.bluescript.inventory.service;

import com.bluescript.inventory.constants.StringConstants;
import com.bluescript.inventory.entity.InventoryEntryEntity;
import com.bluescript.inventory.exception.NoRecordFoundException;
import com.bluescript.inventory.repository.InventoryEntryRepo;
import com.bluescript.inventory.request.InventoryEntryRequest;
import com.bluescript.inventory.response.InventoryEntryDeleteResponse;
import com.bluescript.inventory.utils.InventoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryEntryService {

    @Autowired
    InventoryEntryRepo entryRepo;

    public InventoryEntryEntity createEntry(InventoryEntryRequest entryRequest) {

        String inventoryEntryId= InventoryUtils.generateId(StringConstants.inventoryEntryId_prefix);
        InventoryEntryEntity entryEntity=new InventoryEntryEntity();
        entryEntity.setInventoryEntryId(inventoryEntryId);
        entryEntity.setProductDefinitionId(entryRequest.getProductDefinitionId());
        entryEntity.setReceivedLocation(entryRequest.getReceivedLocation());
        entryEntity.setReceivedQuantity(entryRequest.getReceivedQuantity());
        entryEntity.setRemarks(entryRequest.getRemarks());

        return entryRepo.save(entryEntity);
    }

    public InventoryEntryEntity getEntry(String inventoryEntryId) {

        InventoryEntryEntity entryEntity=entryRepo.findByinventoryEntryId(inventoryEntryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inventoryEntryId);
        });

        return entryEntity;
    }

    public InventoryEntryDeleteResponse deleteEntry(String inventoryEntryId) {

        InventoryEntryEntity entryEntity=entryRepo.findByinventoryEntryId(inventoryEntryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inventoryEntryId);
        });

        InventoryEntryDeleteResponse entryDeleteResponse=new InventoryEntryDeleteResponse(inventoryEntryId,true);
        entryRepo.delete(entryEntity);

        return entryDeleteResponse;
    }

    public InventoryEntryEntity updateEntry(String inventoryEntryId, InventoryEntryRequest entryRequest) {

        InventoryEntryEntity entryEntity=entryRepo.findByinventoryEntryId(inventoryEntryId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +inventoryEntryId);
        });
        entryEntity.getInventoryEntryId();
        entryEntity.setProductDefinitionId(entryRequest.getProductDefinitionId());
        entryEntity.setReceivedLocation(entryRequest.getReceivedLocation());
        entryEntity.setReceivedQuantity(entryRequest.getReceivedQuantity());
        entryEntity.setRemarks(entryRequest.getRemarks());

       return entryRepo.save(entryEntity);
    }
}
