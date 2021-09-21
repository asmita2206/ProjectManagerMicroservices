package com.bluescript.projectdetails.service;

import com.bluescript.projectdetails.api.controller.request.PurchaseOrderRequest;
import com.bluescript.projectdetails.constants.StringConstants;
import com.bluescript.projectdetails.entity.PurchaseOrderEntity;
import com.bluescript.projectdetails.exception.NoRecordFoundException;
import com.bluescript.projectdetails.repository.PurchaseOrderRepo;
import com.bluescript.projectdetails.response.PurchaseOrderResponse;
import com.bluescript.projectdetails.utils.ProjectDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {

    @Autowired
    PurchaseOrderRepo purchaseOrderRepo;

   /* public List<PurchaseOrderModel> getOrderBy(String projectId) {
        List<PurchaseOrderModel> purchaseOrderModels=purchaseOrderRepo.findByProjectId(projectId);

        if(!purchaseOrderModels.isEmpty())
            return purchaseOrderModels;
        else
            ResponseEntity.status(HttpStatus.NOT_FOUND);
            return purchaseOrderModels;
    }*/

    public PurchaseOrderEntity getOrderById(int purchaseOrderId) throws NoRecordFoundException {

        PurchaseOrderEntity purchaseOrderEntity = purchaseOrderRepo.findByPurchaseOrderId(purchaseOrderId).orElseThrow(() -> {
            return new NoRecordFoundException("NO_Id_available {}" + purchaseOrderId);
        });

        return purchaseOrderEntity;
    }

    public PurchaseOrderEntity insertOrder(PurchaseOrderRequest purchaseOrderRequest) {

        String projectId= ProjectDetailsUtils.generateId(StringConstants.projectId_prefix);
        PurchaseOrderEntity purchaseOrderEntity=new PurchaseOrderEntity();
        purchaseOrderEntity.setProjectId(projectId);
        purchaseOrderEntity.setOrderNumber(purchaseOrderRequest.getOrderNumber());
        purchaseOrderEntity.setOrderDate(purchaseOrderRequest.getOrderDate());
        purchaseOrderEntity.setOrderValidTillDate(purchaseOrderRequest.getOrderValidTillDate());

        return purchaseOrderRepo.save(purchaseOrderEntity);
    }

    public PurchaseOrderResponse deletePurchaseOrder(int purchaseOrderId) throws NoRecordFoundException {
        PurchaseOrderEntity purchaseOrderEntity=purchaseOrderRepo.findByPurchaseOrderId(purchaseOrderId).orElseThrow(()->{
            return new NoRecordFoundException("NO_Id_available :" +purchaseOrderId);
        });
        PurchaseOrderResponse purchaseOrderResponse=new PurchaseOrderResponse(purchaseOrderId,true);

            purchaseOrderRepo.delete(purchaseOrderEntity);

       return purchaseOrderResponse;

    }

    public PurchaseOrderEntity updateOrsave(int purchaseOrderId, PurchaseOrderRequest purchaseOrderRequest) throws NoRecordFoundException {

        PurchaseOrderEntity purchaseOrderEntity=purchaseOrderRepo.findByPurchaseOrderId(purchaseOrderId).orElseThrow(()->{
            return new NoRecordFoundException("NO_Id_available {}" +purchaseOrderId);
        });

        purchaseOrderEntity.setOrderDate(purchaseOrderRequest.getOrderDate());
        purchaseOrderEntity.setOrderNumber(purchaseOrderRequest.getOrderNumber());
        purchaseOrderEntity.setOrderValidTillDate(purchaseOrderRequest.getOrderValidTillDate());
        purchaseOrderEntity.getProjectId();
            return purchaseOrderRepo.save(purchaseOrderEntity);

    }

    public PurchaseOrderEntity updateOrsaveBy(String projectId, PurchaseOrderRequest purchaseOrderRequest) {


        PurchaseOrderEntity purchaseOrderEntity = purchaseOrderRepo.findByprojectId(projectId);

        purchaseOrderEntity.setOrderDate(purchaseOrderRequest.getOrderDate());
        purchaseOrderEntity.setOrderNumber(purchaseOrderRequest.getOrderNumber());
        purchaseOrderEntity.setOrderValidTillDate(purchaseOrderRequest.getOrderValidTillDate());
        purchaseOrderEntity.getProjectId();
        return purchaseOrderRepo.save(purchaseOrderEntity);
    }
}
