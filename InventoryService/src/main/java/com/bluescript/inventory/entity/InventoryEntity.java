package com.bluescript.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "inventory_tbl")
public class InventoryEntity {

    @Id
    private String inventoryId;
    private String inventoryEntryId;
    private String purchaseOrderId;
    private String challanId;
    private Date receivedDate;

    public InventoryEntity() {
    }

    public InventoryEntity(String inventoryId, String inventoryEntryId, String purchaseOrderId, String challanId, Date receivedDate) {
        this.inventoryId = inventoryId;
        this.inventoryEntryId = inventoryEntryId;
        this.purchaseOrderId = purchaseOrderId;
        this.challanId = challanId;
        this.receivedDate = receivedDate;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryEntryId() {
        return inventoryEntryId;
    }

    public void setInventoryEntryId(String inventoryEntryId) {
        this.inventoryEntryId = inventoryEntryId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getChallanId() {
        return challanId;
    }

    public void setChallanId(String challanId) {
        this.challanId = challanId;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "inventoryId='" + inventoryId + '\'' +
                ", inventoryEntryId='" + inventoryEntryId + '\'' +
                ", purchaseOrderId='" + purchaseOrderId + '\'' +
                ", challanId='" + challanId + '\'' +
                ", receivedDate=" + receivedDate +
                '}';
    }
}
