package com.bluescript.challan.request;

public class ReceiverRequest {

    private String receivedByUserId;

    public ReceiverRequest() {
    }

    public ReceiverRequest( String receivedByUserId) {
        this.receivedByUserId = receivedByUserId;
    }

    public String getReceivedByUserId() {
        return receivedByUserId;
    }

    public void setReceivedByUserId(String receivedByUserId) {
        this.receivedByUserId = receivedByUserId;
    }



}
