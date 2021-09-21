package com.bluescript.inventory.repository;

import com.bluescript.inventory.entity.InventoryEntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryEntryRepo extends JpaRepository<InventoryEntryEntity,String> {
   Optional <InventoryEntryEntity> findByinventoryEntryId(String inventoryEntryId);
}
