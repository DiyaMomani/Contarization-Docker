package com.example.hospitalData.Users;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class User {
    @JsonProperty("username")
    private String name;
    @JsonProperty("password")
    private String password;
}
