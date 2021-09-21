package com.bluescript.challan.response;

public class ChallanDeleteResponse {

    private String challanId;
    private boolean challanIdDeleted;

    public ChallanDeleteResponse(String challanId, boolean challanIdDeleted) {
        this.challanId = challanId;
        this.challanIdDeleted = challanIdDeleted;
    }

    public String getChallanId() {
        return challanId;
    }

    public void setChallanId(String challanId) {
        this.challanId = challanId;
    }

    public boolean isChallanIdDeleted() {
        return challanIdDeleted;
    }

    public void setChallanIdDeleted(boolean challanIdDeleted) {
        this.challanIdDeleted = challanIdDeleted;
    }
}
