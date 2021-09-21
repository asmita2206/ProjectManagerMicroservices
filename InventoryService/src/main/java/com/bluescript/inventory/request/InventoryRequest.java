package com.bluescript.inventory.request;

import java.util.Date;

public class InventoryRequest {

    private String inventoryEntryId;
    private String purchaseOrderId;
    private String challanId;
    private Date receivedDate;

    public InventoryRequest() {
    }

    public InventoryRequest( String inventoryEntryId, String purchaseOrderId, String challanId, Date receivedDate) {
        this.inventoryEntryId = inventoryEntryId;
        this.purchaseOrderId = purchaseOrderId;
        this.challanId = challanId;
        this.receivedDate = receivedDate;
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

}
