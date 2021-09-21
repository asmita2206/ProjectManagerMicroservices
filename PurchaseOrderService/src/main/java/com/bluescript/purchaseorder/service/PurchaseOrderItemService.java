package com.bluescript.purchaseorder.service;

import com.bluescript.purchaseorder.constants.StringConstants;
import com.bluescript.purchaseorder.entity.PurchaseOrderItemEntity;
import com.bluescript.purchaseorder.exception.NoRecordFoundException;
import com.bluescript.purchaseorder.repository.PurchaseOrderItemRepo;
import com.bluescript.purchaseorder.request.PurchaseOrderItemRequest;
import com.bluescript.purchaseorder.response.PurchaseOrderItemDeleteResponse;
import com.bluescript.purchaseorder.utils.PurchaseOrderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderItemService {

    @Autowired
    PurchaseOrderItemRepo orderItemRepo;

    public PurchaseOrderItemEntity createItem(PurchaseOrderItemRequest orderItemRequest) {

        String purchaseOrderItemId= PurchaseOrderUtils.generateId(StringConstants.purchaseOrderItemId_prefix);
        PurchaseOrderItemEntity orderItemEntity=new PurchaseOrderItemEntity();
        orderItemEntity.setPurchaseOrderItemId(purchaseOrderItemId);
        orderItemEntity.setInvetoryDetailsId(orderItemRequest.getInvetoryDetailsId());
        orderItemEntity.setPurchaseRate(orderItemRequest.getPurchaseRate());

        return orderItemRepo.save(orderItemEntity);
    }

    public PurchaseOrderItemEntity getItem(String purchaseOrderItemId) {

        PurchaseOrderItemEntity orderItemEntity=orderItemRepo.findBypurchaseOrderItemId(purchaseOrderItemId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +purchaseOrderItemId);
        });

        return orderItemEntity;
    }

    public PurchaseOrderItemDeleteResponse deleteItem(String purchaseOrderItemId) {

        PurchaseOrderItemEntity orderItemEntity=orderItemRepo.findBypurchaseOrderItemId(purchaseOrderItemId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +purchaseOrderItemId);
        });

        PurchaseOrderItemDeleteResponse orderItemDeleteResponse=new PurchaseOrderItemDeleteResponse(purchaseOrderItemId,true);
        orderItemRepo.delete(orderItemEntity);
        return orderItemDeleteResponse;
    }

    public PurchaseOrderItemEntity updateItem(String purchaseOrderItemId, PurchaseOrderItemRequest orderItemRequest) {

        PurchaseOrderItemEntity orderItemEntity=orderItemRepo.findBypurchaseOrderItemId(purchaseOrderItemId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +purchaseOrderItemId);
        });

        orderItemEntity.getPurchaseOrderItemId();
        orderItemEntity.setPurchaseRate(orderItemRequest.getPurchaseRate());
        orderItemEntity.setInvetoryDetailsId(orderItemRequest.getInvetoryDetailsId());

        return orderItemRepo.save(orderItemEntity);
    }
}
