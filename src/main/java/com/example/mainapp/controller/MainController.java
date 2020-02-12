package com.example.mainapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Main")
public class MainController {

    @RequestMapping("/Info")
    public Object info() {
        return "Module: Main";
    }
}
