package com.nodam.server.controller;

import com.nodam.server.dto.RegisterDTO;
import com.nodam.server.dto.AddressDTO;
import com.nodam.server.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://10.3.20.106:3000")
@RequestMapping("/")
public class AddressController {
    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
    @Autowired
    AddressService addressService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody AddressDTO addressDTO){
        try {
            addressService.register(addressDTO);
            logger.info(addressDTO.getUserId() + " registered " + addressDTO.getWalletAddress() + " success");
            return ResponseEntity.status(HttpStatus.OK).body("Success");
        }
        catch (DuplicateKeyException e) {
            logger.error(addressDTO.getUserId() + " registered duplicate key " + addressDTO.getWalletAddress());
            return ResponseEntity.status(HttpStatus.OK).body("Fail");
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<ArrayList<AddressDTO>> getWalletList(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.OK).body(addressService.getWalletList(userId));
    }

    @GetMapping("/address/{walletAddress}")
    public ResponseEntity<String> isWalletExist(@PathVariable String walletAddress){
        return ResponseEntity.status(HttpStatus.OK).body(addressService.isWalletExist(walletAddress));
    }


}
