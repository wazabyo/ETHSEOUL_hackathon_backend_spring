package com.nodam.server.service;

import com.nodam.server.dto.AddressDTO;
import com.nodam.server.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public String register(AddressDTO addressDTO) throws DuplicateKeyException {
        return addressRepository.register(addressDTO);
    }

    public ArrayList<AddressDTO> getWalletList(String userId) {
        return addressRepository.getWalletList(userId);
    }

    public String isWalletExist(String walletAddress) {
        return addressRepository.getWalletCount(walletAddress);
    }

}
