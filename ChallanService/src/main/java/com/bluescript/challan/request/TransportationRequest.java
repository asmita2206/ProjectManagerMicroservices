package com.bluescript.challan.request;

public class TransportationRequest {

    private String transportationType;
    private long vehicleNumber;

    public TransportationRequest() {
    }

    public TransportationRequest( String transportationType, long vehicleNumber) {
        this.transportationType = transportationType;
        this.vehicleNumber = vehicleNumber;
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
