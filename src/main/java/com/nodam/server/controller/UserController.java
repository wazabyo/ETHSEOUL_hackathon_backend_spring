package com.nodam.server.controller;

import com.nodam.server.dto.RegisterDTO;
import com.nodam.server.dto.UserDTO;
import com.nodam.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public int register(@RequestBody RegisterDTO registerDTO){
        return userService.register(registerDTO);
    }

    @GetMapping("/{userId}/{tokenId}")
    public Boolean checkWalletExist(@PathVariable String userId, @PathVariable int tokenId){
        return userService.checkWalletExist(userId, tokenId);
    }

    @GetMapping("/{userId}")
    public String checkWalletList(@PathVariable String userId){
        return userService.checkWalletList(userId);
    }

    @PostMapping("")
    public int insertUser(@RequestBody UserDTO user){
        return userService.insertUser(user);
    }

    @GetMapping("")
    public ArrayList<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("/{userId}")
    public int updateUserPw(@PathVariable String userId, @RequestBody UserDTO user){
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public int deleteUser(@PathVariable String userId){
        return userService.deleteUser(userId);
    }
}
