package com.nodam.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {
    @GetMapping("")
    public String getAllUsers(){
        return "Hello World";
    }

}
