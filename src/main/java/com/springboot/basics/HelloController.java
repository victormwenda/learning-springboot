package com.springboot.basics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to the world";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Welcome to the helloed world";
    }
}
