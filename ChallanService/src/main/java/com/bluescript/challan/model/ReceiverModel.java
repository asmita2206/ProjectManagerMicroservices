package com.bluescript.challan.model;

public class ReceiverModel {

    private String receiverId;
    private String receivedByUserId;

    public ReceiverModel() {
    }

    public ReceiverModel(String receiverId, String receivedByUserId) {
        this.receiverId = receiverId;
        this.receivedByUserId = receivedByUserId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceivedByUserId() {
        return receivedByUserId;
    }

    public void setReceivedByUserId(String receivedByUserId) {
        this.receivedByUserId = receivedByUserId;
    }
}
