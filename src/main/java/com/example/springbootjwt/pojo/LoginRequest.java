package com.example.springbootjwt.pojo;

public class LoginRequest {

    private String useName;
    private String password;

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
