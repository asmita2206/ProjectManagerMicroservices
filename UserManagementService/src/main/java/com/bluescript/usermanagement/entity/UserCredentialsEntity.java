package com.bluescript.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_credentials")
public class UserCredentialsEntity {

    @Id
    private String userName;
    private String password;
    private boolean Deleted;

    public UserCredentialsEntity() {
    }

    public UserCredentialsEntity(String userName, String password, boolean deleted) {
        this.userName = userName;
        this.password = password;
        Deleted = deleted;
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
        return Deleted;
    }

    public void setDeleted(boolean deleted) {
        Deleted = deleted;
    }

    @Override
    public String toString() {
        return "UserCredentialsEntity{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", Deleted=" + Deleted +
                '}';
    }
}
