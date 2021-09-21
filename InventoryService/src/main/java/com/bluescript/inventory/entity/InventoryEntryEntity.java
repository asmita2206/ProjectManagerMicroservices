package com.bluescript.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_entry")
public class InventoryEntryEntity {

    @Id
    private String inventoryEntryId;
    private String productDefinitionId;
    private long receivedQuantity;
    private String receivedLocation;
    private String remarks;

    public InventoryEntryEntity() {
    }

    public InventoryEntryEntity(String inventoryEntryId, String productDefinitionId, long receivedQuantity, String receivedLocation, String remarks) {
        this.inventoryEntryId = inventoryEntryId;
        this.productDefinitionId = productDefinitionId;
        this.receivedQuantity = receivedQuantity;
        this.receivedLocation = receivedLocation;
        this.remarks = remarks;
    }

    public String getInventoryEntryId() {
        return inventoryEntryId;
    }

    public void setInventoryEntryId(String inventoryEntryId) {
        this.inventoryEntryId = inventoryEntryId;
    }

    public String getProductDefinitionId() {
        return productDefinitionId;
    }

    public void setProductDefinitionId(String productDefinitionId) {
        this.productDefinitionId = productDefinitionId;
    }

    public long getReceivedQuantity() {
        return receivedQuantity;
    }

    public void setReceivedQuantity(long receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    public String getReceivedLocation() {
        return receivedLocation;
    }

    public void setReceivedLocation(String receivedLocation) {
        this.receivedLocation = receivedLocation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "InventoryEntryEntity{" +
                "inventoryEntryId='" + inventoryEntryId + '\'' +
                ", productDefinitionId='" + productDefinitionId + '\'' +
                ", receivedQuantity=" + receivedQuantity +
                ", receivedLocation='" + receivedLocation + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
