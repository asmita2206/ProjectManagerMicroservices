package com.bluescript.inventory.controller;

import com.bluescript.inventory.constants.StringConstants;
import com.bluescript.inventory.entity.InventoryEntryEntity;
import com.bluescript.inventory.request.InventoryEntryRequest;
import com.bluescript.inventory.response.InventoryEntryDeleteResponse;
import com.bluescript.inventory.service.InventoryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/InventoryEntry")
public class InventoryEntryController {

    @Autowired
    InventoryEntryService entryService;

    @PostMapping
    public InventoryEntryEntity createEntry(@RequestBody InventoryEntryRequest entryRequest){
        return entryService.createEntry(entryRequest);
    }

    @GetMapping("/{inventoryEntryId}")
    public InventoryEntryEntity getEntry(@PathVariable ("inventoryEntryId")String inventoryEntryId){
        return entryService.getEntry(inventoryEntryId);
    }

    @DeleteMapping("/{inventoryEntryId}")
    public InventoryEntryDeleteResponse deleteEntry(@PathVariable ("inventoryEntryId") String inventoryEntryId){
        return entryService.deleteEntry(inventoryEntryId);
    }

    @PutMapping("/{inventoryEntryId}")
    public InventoryEntryEntity updateEntry(@PathVariable ("inventoryEntryId") String inventoryEntryId,@RequestBody InventoryEntryRequest entryRequest){
        return entryService.updateEntry(inventoryEntryId,entryRequest);
    }
}
