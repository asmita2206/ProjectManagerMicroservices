package com.bluescript.purchaseorder.response;

public class PurchaseOrderDeleteResponse {

    private String PurchaseOrderId;
    private boolean PurchaseOrderIdDeleted;

    public PurchaseOrderDeleteResponse(String purchaseOrderId, boolean purchaseOrderIdDeleted) {
        PurchaseOrderId = purchaseOrderId;
        PurchaseOrderIdDeleted = purchaseOrderIdDeleted;
    }

    public String getPurchaseOrderId() {
        return PurchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        PurchaseOrderId = purchaseOrderId;
    }

    public boolean isPurchaseOrderIdDeleted() {
        return PurchaseOrderIdDeleted;
    }

    public void setPurchaseOrderIdDeleted(boolean purchaseOrderIdDeleted) {
        PurchaseOrderIdDeleted = purchaseOrderIdDeleted;
    }
}
