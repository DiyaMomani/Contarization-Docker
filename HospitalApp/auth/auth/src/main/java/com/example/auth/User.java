package com.example.auth;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("username")
    private String name;
    @JsonProperty("password")
    private String password;

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
