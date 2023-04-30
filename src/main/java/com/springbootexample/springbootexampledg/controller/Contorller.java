package com.springbootexample.springbootexampledg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contorller {

    @GetMapping("/")
    public String handleMain() {
        return "main";
    }

    @GetMapping("/login")
    public String handleLogin() {
        return "login";
    }
}
