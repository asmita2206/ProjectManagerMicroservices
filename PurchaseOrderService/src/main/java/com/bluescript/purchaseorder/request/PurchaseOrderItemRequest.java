package com.bluescript.purchaseorder.request;

public class PurchaseOrderItemRequest {

    private String invetoryDetailsId;
    private long purchaseRate;

    public PurchaseOrderItemRequest() {
    }

    public PurchaseOrderItemRequest(String invetoryDetailsId, long purchaseRate) {
        this.invetoryDetailsId = invetoryDetailsId;
        this.purchaseRate = purchaseRate;
    }

    public String getInvetoryDetailsId() {
        return invetoryDetailsId;
    }

    public void setInvetoryDetailsId(String invetoryDetailsId) {
        this.invetoryDetailsId = invetoryDetailsId;
    }

    public long getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(long purchaseRate) {
        this.purchaseRate = purchaseRate;
    }
}
