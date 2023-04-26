package com.example.result.Auth;

import com.example.result.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class AuthController {
    private AuthService authService;
    @Autowired
    public void authService(AuthService authService){
        this.authService = authService;
    }
    @GetMapping("/login")
    public String authenticationValidation(){
        return "authPage";
    }

    @PostMapping("/login/check-validation")
    public String validation(@RequestParam(required = false) String username,
                             @RequestParam(required = false) String password){
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return "failPage";
        }
        boolean isValidation = authService.authentication(new User(username,password));
        return (isValidation ? "redirect:/result" : "failPage");
    }

}
