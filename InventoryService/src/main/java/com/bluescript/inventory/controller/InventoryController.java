package com.bluescript.inventory.controller;

import com.bluescript.inventory.constants.StringConstants;
import com.bluescript.inventory.entity.InventoryEntity;
import com.bluescript.inventory.request.InventoryRequest;
import com.bluescript.inventory.response.InventoryDeleteResponse;
import com.bluescript.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping
    public InventoryEntity createInventory(@RequestBody InventoryRequest inventoryRequest){
        return inventoryService.createInventory(inventoryRequest);
    }

    @GetMapping("/{inventoryId}")
    public InventoryEntity getInventory(@PathVariable ("inventoryId")String inventoryId){
        return inventoryService.getInventory(inventoryId);
    }

    @DeleteMapping("/{inventoryId}")
    public InventoryDeleteResponse deleteInventory(@PathVariable("inventoryId") String inventoryId){
        return inventoryService.deleteInventory(inventoryId);
    }

    @PutMapping("/{inventoryId}")
    public InventoryEntity updateInventory(@PathVariable ("inventoryId") String inventoryId,@RequestBody InventoryRequest inventoryRequest){
        return inventoryService.updateInventory(inventoryId,inventoryRequest);
    }
}
