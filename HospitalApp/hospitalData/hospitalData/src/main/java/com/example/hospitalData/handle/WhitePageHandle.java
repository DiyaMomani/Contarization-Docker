package com.example.hospitalData.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WhitePageHandle {
    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException() {
        return "error";
    }
}