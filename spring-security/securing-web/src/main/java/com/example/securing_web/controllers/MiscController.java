package com.example.securing_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiscController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
