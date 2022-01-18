package com.example.introduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String mainPage() {
        System.out.println("mainPage 실행");
        return "main-page";
    }
}