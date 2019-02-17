package com.seniordesign.myapplication;

public class User {

    private String email;
    private String password;

    public String getName(String x) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

        System.out.println("New email registered!");
    }

    public String getPassword(String y) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

        System.out.println("New password created!");
    }


}
