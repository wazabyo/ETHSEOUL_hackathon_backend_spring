package com.nodam.server.controller;

import com.nodam.server.dto.UserDTO;
import com.nodam.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ExamController {
    @GetMapping("")
    public String getAllUsers(){
        return "Hello World";
    }

}
