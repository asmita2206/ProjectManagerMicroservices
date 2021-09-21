package com.bluescript.inquirydetails.response;

public class InquiryDetailsDeleteResponse {

    private String inquiryId;
    private boolean inquiryIdDeleted;

    public InquiryDetailsDeleteResponse(String inquiryId, boolean inquiryIdDeleted) {
        this.inquiryId = inquiryId;
        this.inquiryIdDeleted = inquiryIdDeleted;
    }

    public String getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(String inquiryId) {
        this.inquiryId = inquiryId;
    }

    public boolean isInquiryIdDeleted() {
        return inquiryIdDeleted;
    }

    public void setInquiryIdDeleted(boolean inquiryIdDeleted) {
        this.inquiryIdDeleted = inquiryIdDeleted;
    }
}
