package com.bluescript.purchaseorder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order_item")
public class PurchaseOrderItemEntity {

    @Id
    private String purchaseOrderItemId;
    private String invetoryDetailsId;
    private long purchaseRate;

    public PurchaseOrderItemEntity() {
    }

    public PurchaseOrderItemEntity(String purchaseOrderItemId, String invetoryDetailsId, long purchaseRate) {
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

    @Override
    public String toString() {
        return "PurchaseOrderItemEntity{" +
                "purchaseOrderItemId='" + purchaseOrderItemId + '\'' +
                ", invetoryDetailsId='" + invetoryDetailsId + '\'' +
                ", purchaseRate=" + purchaseRate +
                '}';
    }
}
