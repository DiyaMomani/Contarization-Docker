package com.example.result.Auth;

import com.example.result.User.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService {
    public boolean authentication(User user){
        RestTemplate restTemplate = new RestTemplate();
        String http = "http://auth:8081/auth";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<User> request = new HttpEntity<>(user, headers);
        ResponseEntity<Boolean> response = restTemplate.postForEntity(http , request, Boolean.class);
        return Boolean.TRUE.equals(response.getBody());
    }
}
