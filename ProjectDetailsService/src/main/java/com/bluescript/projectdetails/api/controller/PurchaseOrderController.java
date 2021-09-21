package com.bluescript.projectdetails.api.controller;

import com.bluescript.projectdetails.entity.PurchaseOrderEntity;
import com.bluescript.projectdetails.exception.NoRecordFoundException;
import com.bluescript.projectdetails.repository.PurchaseOrderRepo;
import com.bluescript.projectdetails.api.controller.request.PurchaseOrderRequest;
import com.bluescript.projectdetails.response.PurchaseOrderResponse;
import com.bluescript.projectdetails.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/rest/PurchaseOrder")
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderRepo purchaseOrderRepo;
    @Autowired
    PurchaseOrderService purchaseOrderService;

    @PostMapping
    public PurchaseOrderEntity insertOrder(@RequestBody @Valid PurchaseOrderRequest purchaseOrderRequest) {

        PurchaseOrderEntity purchaseOrderEntity=purchaseOrderService.insertOrder(purchaseOrderRequest);
            return purchaseOrderEntity;
    }

   /* @GetMapping("/get/{projectId}")
    public List<PurchaseOrderModel> getOrder(@PathVariable("projectId") String projectId){
        return purchaseOrderService.getOrderBy(projectId);
    }
*/
    @GetMapping("/{purchaseOrderId}")
    public PurchaseOrderEntity getOrderById(@PathVariable("purchaseOrderId") int purchaseOrderId) throws NoRecordFoundException {
        return purchaseOrderService.getOrderById(purchaseOrderId);
    }


    @DeleteMapping("/{purchaseOrderId}")
    public PurchaseOrderResponse deletePurchaseOrder(@PathVariable("purchaseOrderId") int purchaseOrderId) throws NoRecordFoundException {

       PurchaseOrderResponse purchaseOrderResponse= purchaseOrderService.deletePurchaseOrder(purchaseOrderId);

       return purchaseOrderResponse;
      /* if(purchaseOrderResponse!=null)
       purchaseOrderResponse.getPurchaseOrderIdDeleted();
       return purchaseOrderResponse;*/
      // "Your {purchaseOrderId} record is deleted successfully !!";
       /* PurchaseOrderResponse purchaseOrderResponse=new PurchaseOrderResponse();
        purchaseOrderResponse.getPurchaseOrderId();*/
//        return purchaseOrderResponse;

    }


    @PutMapping("/update/{purchaseOrderId}")
    public PurchaseOrderEntity updateOrsave(@PathVariable("purchaseOrderId") int purchaseOrderId, @Valid @RequestBody PurchaseOrderRequest purchaseOrderRequest) throws NoRecordFoundException {

        PurchaseOrderEntity purchaseOrderEntity=purchaseOrderService.updateOrsave(purchaseOrderId,purchaseOrderRequest);
      return purchaseOrderEntity;

    }

    @PutMapping("/{projectId}")
    public PurchaseOrderEntity updateOrsaveBy(@PathVariable("projectId") String projectId, @Valid @RequestBody PurchaseOrderRequest purchaseOrderRequest){

        PurchaseOrderEntity purchaseOrderEntity=purchaseOrderService.updateOrsaveBy(projectId,purchaseOrderRequest);
        return purchaseOrderEntity;

    }


}
