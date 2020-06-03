package com.jk.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserBean implements Serializable {

    private Integer userId;

    private String userName;

    private String password;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
