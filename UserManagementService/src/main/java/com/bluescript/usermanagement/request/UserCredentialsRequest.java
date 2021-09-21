package com.bluescript.usermanagement.request;

public class UserCredentialsRequest {

    private String userName;
    private String password;

    public UserCredentialsRequest() {
    }

    public UserCredentialsRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
