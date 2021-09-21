package com.bluescript.purchaseorder.model;

public class PurchaseOrderItemModel {

    private String purchaseOrderItemId;
    private String invetoryDetailsId;
    private long purchaseRate;

    public PurchaseOrderItemModel() {
    }

    public PurchaseOrderItemModel(String purchaseOrderItemId, String invetoryDetailsId, long purchaseRate) {
        this.purchaseOrderItemId = purchaseOrderItemId;
        this.invetoryDetailsId = invetoryDetailsId;
        this.purchaseRate = purchaseRate;
    }

    public String getPurchaseOrderItemId() {
        return purchaseOrderItemId;
    }

    public void setPurchaseOrderItemId(String purchaseOrderItemId) {
        this.purchaseOrderItemId = purchaseOrderItemId;
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
