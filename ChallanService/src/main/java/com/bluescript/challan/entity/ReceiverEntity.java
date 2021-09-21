package com.bluescript.challan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receiver_details")
public class ReceiverEntity {

    @Id
    private String receiverId;
    private String receivedByUserId;

    public ReceiverEntity() {
    }

    public ReceiverEntity(String receiverId, String receivedByUserId) {
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

    @Override
    public String toString() {
        return "ReceiverEntity{" +
                "receiverId='" + receiverId + '\'' +
                ", receivedByUserId='" + receivedByUserId + '\'' +
                '}';
    }
}
