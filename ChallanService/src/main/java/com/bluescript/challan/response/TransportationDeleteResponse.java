package com.bluescript.challan.response;

public class TransportationDeleteResponse {

    private String transportationId;
    private boolean transportationIdDeleted;

    public TransportationDeleteResponse(String transportationId, boolean transportationIdDeleted) {
        this.transportationId = transportationId;
        this.transportationIdDeleted = transportationIdDeleted;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId;
    }

    public boolean isTransportationIdDeleted() {
        return transportationIdDeleted;
    }

    public void setTransportationIdDeleted(boolean transportationIdDeleted) {
        this.transportationIdDeleted = transportationIdDeleted;
    }
}
