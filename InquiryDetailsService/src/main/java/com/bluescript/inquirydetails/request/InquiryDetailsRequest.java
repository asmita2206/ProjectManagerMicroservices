package com.bluescript.inquirydetails.request;

public class InquiryDetailsRequest {

    private String vendorId;
    private String BOQId;
    private String inventoryDetailsId;

    public InquiryDetailsRequest() {
    }

    public InquiryDetailsRequest( String vendorId, String BOQId, String inventoryDetailsId) {
        this.vendorId = vendorId;
        this.BOQId = BOQId;
        this.inventoryDetailsId = inventoryDetailsId;
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
