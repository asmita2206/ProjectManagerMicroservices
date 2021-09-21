package com.bluescript.purchaseorder.repository;

import com.bluescript.purchaseorder.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrderEntity,String> {

   Optional <PurchaseOrderEntity> findBypurchaseOrderId(String purchaseOrderId);
}
