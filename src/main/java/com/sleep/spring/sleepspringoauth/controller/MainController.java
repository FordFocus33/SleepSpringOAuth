package com.sleep.spring.sleepspringoauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String helloPage(){
        return "Welcome, have a wonderful day!";
    }

    @GetMapping("/secured")
    public String securedPage(Authentication authentication){
        return "It's a secret page, " + authentication.getName() + " but you are welcome!";
    }
}
