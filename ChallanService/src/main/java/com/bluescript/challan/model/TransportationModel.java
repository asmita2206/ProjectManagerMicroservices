package com.bluescript.challan.model;

public class TransportationModel {

    private String transportationId;
    private String transportationType;
    private long vehicleNumber;

    public TransportationModel() {
    }

    public TransportationModel(String transportationId, String transportationType, long vehicleNumber) {
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
}
