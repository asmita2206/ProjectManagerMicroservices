package com.bluescript.purchaseorder.repository;

import com.bluescript.purchaseorder.entity.PurchaseOrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PurchaseOrderItemRepo extends JpaRepository<PurchaseOrderItemEntity,String> {

  Optional<PurchaseOrderItemEntity> findBypurchaseOrderItemId(String purchaseOrderItemId);
}
