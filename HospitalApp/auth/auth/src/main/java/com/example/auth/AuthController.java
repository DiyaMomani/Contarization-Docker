package com.example.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthController {
    private AuthService authService;
    @Autowired
    public void AuthService(AuthService authService){
        this.authService = authService;
    }
    @PostMapping("/auth")
    public boolean isAuthenticated(@RequestBody User user){
        return authService.checkValidation(user);
    }
}
