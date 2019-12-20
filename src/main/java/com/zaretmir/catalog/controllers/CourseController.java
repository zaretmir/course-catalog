package com.zaretmir.catalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CourseController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello";
    }
}
