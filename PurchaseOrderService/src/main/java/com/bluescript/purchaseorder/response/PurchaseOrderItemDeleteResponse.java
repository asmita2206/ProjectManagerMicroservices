package com.bluescript.purchaseorder.response;

public class PurchaseOrderItemDeleteResponse {

    private String purchaseOrderItemId;
    private boolean purchaseOrderItemIdDeleted;

    public PurchaseOrderItemDeleteResponse(String purchaseOrderItemId, boolean purchaseOrderItemIdDeleted) {
        this.purchaseOrderItemId = purchaseOrderItemId;
        this.purchaseOrderItemIdDeleted = purchaseOrderItemIdDeleted;
    }

    public String getPurchaseOrderItemId() {
        return purchaseOrderItemId;
    }

    public void setPurchaseOrderItemId(String purchaseOrderItemId) {
        this.purchaseOrderItemId = purchaseOrderItemId;
    }

    public boolean isPurchaseOrderItemIdDeleted() {
        return purchaseOrderItemIdDeleted;
    }

    public void setPurchaseOrderItemIdDeleted(boolean purchaseOrderItemIdDeleted) {
        this.purchaseOrderItemIdDeleted = purchaseOrderItemIdDeleted;
    }
}
