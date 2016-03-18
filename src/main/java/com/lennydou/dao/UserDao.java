package com.lennydou.dao;

public class UserDao {
    private int userId;
    private String userName;

    public UserDao(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
