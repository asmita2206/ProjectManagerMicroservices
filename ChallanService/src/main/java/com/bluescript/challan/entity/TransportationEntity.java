package com.bluescript.challan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transportation_details")
public class TransportationEntity {

    @Id
    private String transportationId;
    private String transportationType;
    private long vehicleNumber;

    public TransportationEntity() {
    }

    public TransportationEntity(String transportationId, String transportationType, long vehicleNumber) {
        this.transportationId = transportationId;
        this.transportationType = transportationType;
        this.vehicleNumber = vehicleNumber;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public long getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(long vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return "TransportationEntity{" +
                "transportationId='" + transportationId + '\'' +
                ", transportationType='" + transportationType + '\'' +
                ", vehicleNumber=" + vehicleNumber +
                '}';
    }
}
