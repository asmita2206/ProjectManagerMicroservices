package com.bluescript.purchaseorder.controller;

import com.bluescript.purchaseorder.entity.PurchaseOrderItemEntity;
import com.bluescript.purchaseorder.request.PurchaseOrderItemRequest;
import com.bluescript.purchaseorder.response.PurchaseOrderItemDeleteResponse;
import com.bluescript.purchaseorder.service.PurchaseOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PurchaseOrderItem")
public class PurchaseOrderItemController {

    @Autowired
    PurchaseOrderItemService orderItemService;

    @PostMapping
    public PurchaseOrderItemEntity createItem(@RequestBody PurchaseOrderItemRequest orderItemRequest){
        return orderItemService.createItem(orderItemRequest);
    }

    @GetMapping("/{purchaseOrderItemId}")
    public PurchaseOrderItemEntity getItem(@PathVariable ("purchaseOrderItemId") String purchaseOrderItemId){
        return orderItemService.getItem(purchaseOrderItemId);

    }

    @DeleteMapping("/{purchaseOrderItemId}")
    public PurchaseOrderItemDeleteResponse deleteItem(@PathVariable ("purchaseOrderItemId") String purchaseOrderItemId){
        return orderItemService.deleteItem(purchaseOrderItemId);
    }

    @PutMapping("/{purchaseOrderItemId}")
    public PurchaseOrderItemEntity updateItem(@PathVariable ("purchaseOrderItemId") String purchaseOrderItemId,@RequestBody PurchaseOrderItemRequest orderItemRequest){
        return orderItemService.updateItem(purchaseOrderItemId,orderItemRequest);
    }
}
