package com.bluescript.inventory.request;

public class InventoryEntryRequest {

    private String productDefinitionId;
    private long receivedQuantity;
    private String receivedLocation;
    private String remarks;

    public InventoryEntryRequest() {
    }

    public InventoryEntryRequest(String productDefinitionId, long receivedQuantity, String receivedLocation, String remarks) {
        this.productDefinitionId = productDefinitionId;
        this.receivedQuantity = receivedQuantity;
        this.receivedLocation = receivedLocation;
        this.remarks = remarks;
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
}
