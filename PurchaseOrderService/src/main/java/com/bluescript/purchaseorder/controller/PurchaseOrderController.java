package com.bluescript.purchaseorder.controller;

import com.bluescript.purchaseorder.constants.StringConstants;
import com.bluescript.purchaseorder.entity.PurchaseOrderEntity;
import com.bluescript.purchaseorder.request.PurchaseOrderRequest;
import com.bluescript.purchaseorder.response.PurchaseOrderDeleteResponse;
import com.bluescript.purchaseorder.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PurchaseOrder")
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService orderService;

    @PostMapping
    public PurchaseOrderEntity createOrder(@RequestBody PurchaseOrderRequest orderRequest){
        return orderService.createOrder(orderRequest);
    }

    @GetMapping("/{purchaseOrderId}")
    public PurchaseOrderEntity getOrder(@PathVariable ("purchaseOrderId")String purchaseOrderId){
        return orderService.getOrder(purchaseOrderId);
    }

    @DeleteMapping("/{purchaseOrderId}")
    public PurchaseOrderDeleteResponse deleteOrder(@PathVariable ("purchaseOrderId") String purchaseOrderId){
        return orderService.deleteOrder(purchaseOrderId);
    }

    @PutMapping("/{purchaseOrderId}")
    public PurchaseOrderEntity updateOrder(@PathVariable ("purchaseOrderId") String purchaseOrderId,@RequestBody PurchaseOrderRequest orderRequest){
        return orderService.updateOrder(purchaseOrderId,orderRequest);
    }
}
