package com.bluescript.purchaseorder.request;

public class PurchaseOrderRequest {

    private String purchaseOrderItemId;
    private String vendorId;

    public PurchaseOrderRequest() {
    }

    public PurchaseOrderRequest( String purchaseOrderItemId, String vendorId) {
        this.purchaseOrderItemId = purchaseOrderItemId;
        this.vendorId = vendorId;
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
