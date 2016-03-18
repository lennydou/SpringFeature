package com.lennydou.bean;

public class User {
    private static int userCount = 0;

    private int id;

    public User() {
        id = ++userCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
