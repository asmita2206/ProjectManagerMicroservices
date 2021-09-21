package com.bluescript.usermanagement.model;

public class UserCredentialsModel {

    private String userName;
    private String password;
    private boolean deleted;


    public UserCredentialsModel() {
    }

    public UserCredentialsModel(String userName, String password, boolean deleted) {
        this.userName = userName;
        this.password = password;
        this.deleted = deleted;
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
