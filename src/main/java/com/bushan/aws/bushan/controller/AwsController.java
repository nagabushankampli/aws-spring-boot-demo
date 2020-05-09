package com.bushan.aws.bushan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AwsController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World Rohin";
    }
}
