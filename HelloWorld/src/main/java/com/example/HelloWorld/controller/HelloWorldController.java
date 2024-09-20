package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello/{name}")
    public String getHelloWorld(@PathVariable String name){
        StringBuilder s = new StringBuilder();
        s.append("Hello ").append(name).append("!");
        return s.toString();
    }
}
