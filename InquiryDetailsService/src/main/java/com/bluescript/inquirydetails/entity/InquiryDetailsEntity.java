package com.bluescript.inquirydetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inquiry_details")
public class InquiryDetailsEntity {

    @Id
    private String inquiryId;
    private String vendorId;
    private String BOQId;
    private String inventoryDetailsId;

    public InquiryDetailsEntity() {
    }

    public InquiryDetailsEntity(String inquiryId, String vendorId, String BOQId, String inventoryDetailsId) {
        this.inquiryId = inquiryId;
        this.vendorId = vendorId;
        this.BOQId = BOQId;
        this.inventoryDetailsId = inventoryDetailsId;
    }

    public String getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(String inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getBOQId() {
        return BOQId;
    }

    public void setBOQId(String BOQId) {
        this.BOQId = BOQId;
    }

    public String getInventoryDetailsId() {
        return inventoryDetailsId;
    }

    public void setInventoryDetailsId(String inventoryDetailsId) {
        this.inventoryDetailsId = inventoryDetailsId;
    }

    @Override
    public String toString() {
        return "InquiryDetailsEntity{" +
                "inquiryId='" + inquiryId + '\'' +
                ", vendorId='" + vendorId + '\'' +
                ", BOQId='" + BOQId + '\'' +
                ", inventoryDetailsId='" + inventoryDetailsId + '\'' +
                '}';
    }
}
