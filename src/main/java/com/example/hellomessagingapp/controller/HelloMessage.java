package com.example.hellomessagingapp.controller;

import com.example.hellomessagingapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessage {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello Naman";
    }

    @RequestMapping(value = {"/query", ""}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "fName") String fName) {
        return "Hello " + fName + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + " !";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
