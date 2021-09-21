package com.bluescript.usermanagement.response;

public class UserCredentialsDeleteResponse {
    private String userName;
    private boolean userNameDeleted;

    public UserCredentialsDeleteResponse(String userName, boolean userNameDeleted) {
        this.userName = userName;
        this.userNameDeleted = userNameDeleted;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isUserNameDeleted() {
        return userNameDeleted;
    }

    public void setUserNameDeleted(boolean userNameDeleted) {
        this.userNameDeleted = userNameDeleted;
    }
}
