package com.bluescript.purchaseorder.model;

public class PurchaseOrderModel {

    private String purchaseOrderId;
    private String purchaseOrderItemId;
    private String vendorId;

    public PurchaseOrderModel() {
    }

    public PurchaseOrderModel(String purchaseOrderId, String purchaseOrderItemId, String vendorId) {
        this.purchaseOrderId = purchaseOrderId;
        this.purchaseOrderItemId = purchaseOrderItemId;
        this.vendorId = vendorId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderItemId() {
        return purchaseOrderItemId;
    }

    public void setPurchaseOrderItemId(String purchaseOrderItemId) {
        this.purchaseOrderItemId = purchaseOrderItemId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
}
