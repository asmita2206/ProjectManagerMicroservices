package com.bluescript.purchaseorder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrderEntity {

    @Id
    private String purchaseOrderId;
    private String purchaseOrderItemId;
    private String vendorId;

    public PurchaseOrderEntity() {
    }

    public PurchaseOrderEntity(String purchaseOrderId, String purchaseOrderItemId, String vendorId) {
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

    @Override
    public String toString() {
        return "PurchaseOrderEntity{" +
                "purchaseOrderId='" + purchaseOrderId + '\'' +
                ", purchaseOrderItemId='" + purchaseOrderItemId + '\'' +
                ", vendorId='" + vendorId + '\'' +
                '}';
    }
}
