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
    public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
        return "Hello " + fName + " " + lName + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName()+" "+user.getLastName()+" !";
    }
}
