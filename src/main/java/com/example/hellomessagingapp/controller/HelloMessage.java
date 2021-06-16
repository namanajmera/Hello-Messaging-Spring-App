package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloMessage {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello Naman";
    }
}
