package com.bluescript.challan.response;

public class ReceiverDeleteResponse {

    private String receiverId;
    private boolean receiverIdDeleted;

    public ReceiverDeleteResponse(String receiverId, boolean receiverIdDeleted) {
        this.receiverId = receiverId;
        this.receiverIdDeleted = receiverIdDeleted;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public boolean isReceiverIdDeleted() {
        return receiverIdDeleted;
    }

    public void setReceiverIdDeleted(boolean receiverIdDeleted) {
        this.receiverIdDeleted = receiverIdDeleted;
    }
}
