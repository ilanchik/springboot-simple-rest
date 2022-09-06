package com.example.springbootfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody // Java object to JSON, send back to client in form of object or JSON
@RestController // Combine @controller and @responseBody, can now handle web requests
public class HelloWorldController {

    // Get HTTP Method
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
