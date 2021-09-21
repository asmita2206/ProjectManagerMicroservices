package com.bluescript.purchaseorder.service;

import com.bluescript.purchaseorder.constants.StringConstants;
import com.bluescript.purchaseorder.entity.PurchaseOrderEntity;
import com.bluescript.purchaseorder.exception.NoRecordFoundException;
import com.bluescript.purchaseorder.repository.PurchaseOrderRepo;
import com.bluescript.purchaseorder.request.PurchaseOrderRequest;
import com.bluescript.purchaseorder.response.PurchaseOrderDeleteResponse;
import com.bluescript.purchaseorder.utils.PurchaseOrderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {

    @Autowired
    PurchaseOrderRepo orderRepo;

    public PurchaseOrderEntity createOrder(PurchaseOrderRequest orderRequest) {

        String purchaseOrderId= PurchaseOrderUtils.generateId(StringConstants.purchaseOrderId_prefix);
        PurchaseOrderEntity orderEntity=new PurchaseOrderEntity();
        orderEntity.setPurchaseOrderId(purchaseOrderId);
        orderEntity.setPurchaseOrderItemId(orderRequest.getPurchaseOrderItemId());
        orderEntity.setVendorId(orderRequest.getVendorId());

        return orderRepo.save(orderEntity);
    }

    public PurchaseOrderEntity getOrder(String purchaseOrderId) {
        PurchaseOrderEntity orderEntity=orderRepo.findBypurchaseOrderId(purchaseOrderId).orElseThrow(()->{
            return new NoRecordFoundException("no_rocord_found :" +purchaseOrderId);
        });

        return orderEntity;
    }

    public PurchaseOrderDeleteResponse deleteOrder(String purchaseOrderId) {

        PurchaseOrderEntity orderEntity=orderRepo.findBypurchaseOrderId(purchaseOrderId).orElseThrow(()->{
            return new NoRecordFoundException("no_rocord_found :" +purchaseOrderId);
        });
        PurchaseOrderDeleteResponse orderDeleteResponse=new PurchaseOrderDeleteResponse(purchaseOrderId,true);
        orderRepo.delete(orderEntity);
        return orderDeleteResponse;

    }


    public PurchaseOrderEntity updateOrder(String purchaseOrderId, PurchaseOrderRequest orderRequest) {

        PurchaseOrderEntity orderEntity=orderRepo.findBypurchaseOrderId(purchaseOrderId).orElseThrow(()->{
            return new NoRecordFoundException("no_rocord_found :" +purchaseOrderId);
        });

        orderEntity.getPurchaseOrderId();
        orderEntity.setVendorId(orderRequest.getVendorId());
        orderEntity.setPurchaseOrderItemId(orderRequest.getPurchaseOrderItemId());

        return orderRepo.save(orderEntity);
    }
}
