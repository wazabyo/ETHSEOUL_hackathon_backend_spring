package com.nodam.server.controller;

import com.nodam.server.dto.RegisterDTO;
import com.nodam.server.dto.AddressDTO;
import com.nodam.server.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://10.3.20.106:3000")
@RequestMapping("/")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/register")
    public int register(@RequestBody AddressDTO addressDTO){
        return addressService.register(addressDTO);
    }

    @GetMapping("/user/{userId}")
    public ArrayList<AddressDTO> getWalletList(@PathVariable String userId){
        return addressService.getWalletList(userId);
    }

    @GetMapping("/address/{walletAddress}")
    public Boolean isWalletExist(@PathVariable String walletAddress){
        return addressService.isWalletExist(walletAddress);
    }


}
