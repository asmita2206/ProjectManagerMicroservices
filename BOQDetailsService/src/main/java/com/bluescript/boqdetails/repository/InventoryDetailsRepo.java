package com.bluescript.boqdetails.repository;

import com.bluescript.boqdetails.entity.InventoryDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryDetailsRepo extends JpaRepository<InventoryDetailsEntity,String> {

  Optional<InventoryDetailsEntity> findByInventoryDetailsId(String inventoryDetailsId);
}
