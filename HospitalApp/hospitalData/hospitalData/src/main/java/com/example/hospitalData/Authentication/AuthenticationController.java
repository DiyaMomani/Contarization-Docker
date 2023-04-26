package com.example.hospitalData.Authentication;

import com.example.hospitalData.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    private AuthenticationService authenticationService;

    @Autowired
    public void authService(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }
    @GetMapping("/login")
    public String authenticationValidation(){
        return "authenticationPage";
    }
    @PostMapping("/login/check-validation")
    public String validation(@RequestParam(required = false) String username,
                             @RequestParam(required = false) String password){
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return "authenticationFail";
        }
        boolean isValidation = authenticationService.authentication(new User(username,password));
        return (isValidation ? "redirect:/add-patient" : "authenticationFail");
    }

}
