package com.bluescript.inquirydetails.model;

public class InquiryDetailsModel {

    private String inquiryId;
    private String vendorId;
    private String BOQId;
    private String inventoryDetailsId;

    public InquiryDetailsModel() {
    }

    public InquiryDetailsModel(String inquiryId, String vendorId, String BOQId, String inventoryDetailsId) {
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
}
