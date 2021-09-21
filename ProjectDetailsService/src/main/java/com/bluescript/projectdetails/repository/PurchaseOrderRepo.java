package com.bluescript.projectdetails.repository;

import com.bluescript.projectdetails.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrderEntity,Integer> {

    List<PurchaseOrderEntity> findByProjectId(String projectId);
    PurchaseOrderEntity findByprojectId(String projectId);
    Optional<PurchaseOrderEntity> findByPurchaseOrderId(int purchaseOrderId);
}
