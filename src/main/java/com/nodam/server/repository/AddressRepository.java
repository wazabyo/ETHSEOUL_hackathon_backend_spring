package com.nodam.server.repository;

import com.nodam.server.dto.AddressDTO;
import com.nodam.server.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AddressRepository {
    @Autowired
    private AddressMapper mapper;

    public int register(AddressDTO addressDTO) {
        return mapper.register(addressDTO);
    }

    public ArrayList<AddressDTO> getWalletList(String userId) {
        return mapper.getWalletList(userId);
    }

    public Boolean isWalletExist(String walletAddress) {
        return mapper.isWalletExist(walletAddress);
    }
}
