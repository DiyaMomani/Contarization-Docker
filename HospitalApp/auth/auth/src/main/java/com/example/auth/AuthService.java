package com.example.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean checkValidation(User user){
        return (user.getName().equalsIgnoreCase("Diaa"))
                && (user.getPassword().equalsIgnoreCase("123456"));
    }

}
