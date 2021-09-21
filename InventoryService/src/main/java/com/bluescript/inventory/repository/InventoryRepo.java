package com.bluescript.inventory.repository;

import com.bluescript.inventory.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepo extends JpaRepository<InventoryEntity,String> {

   Optional <InventoryEntity> findByinventoryId(String inventoryId);
}
