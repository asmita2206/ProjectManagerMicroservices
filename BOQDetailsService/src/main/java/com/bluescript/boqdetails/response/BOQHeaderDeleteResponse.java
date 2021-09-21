package com.bluescript.boqdetails.response;

public class BOQHeaderDeleteResponse {

    public String boqHeaderId;
    public boolean boqHeaderIdDeleted;

    public BOQHeaderDeleteResponse(String boqHeaderId, boolean boqHeaderIdDeleted) {
        this.boqHeaderId = boqHeaderId;
        this.boqHeaderIdDeleted = boqHeaderIdDeleted;
    }
}
