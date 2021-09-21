package com.bluescript.usermanagement.response;

public class UserAssociationDeleteResponse {
    private String userAssociationId;
    private boolean userAssociationIdDeleted;

    public UserAssociationDeleteResponse(String userAssociationId, boolean userAssociationIdDeleted) {
        this.userAssociationId = userAssociationId;
        this.userAssociationIdDeleted = userAssociationIdDeleted;
    }

    public String getUserAssociationId() {
        return userAssociationId;
    }

    public void setUserAssociationId(String userAssociationId) {
        this.userAssociationId = userAssociationId;
    }

    public boolean isUserAssociationIdDeleted() {
        return userAssociationIdDeleted;
    }

    public void setUserAssociationIdDeleted(boolean userAssociationIdDeleted) {
        this.userAssociationIdDeleted = userAssociationIdDeleted;
    }
}
