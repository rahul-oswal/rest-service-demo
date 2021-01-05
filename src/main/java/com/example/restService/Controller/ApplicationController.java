package com.example.restService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApplicationController {

    @GetMapping(value = "/demo")
    public String sayHelloWorld() {
        return "Hello World!";
    }
}
