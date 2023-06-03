package com.nodam.server.repository;

import com.nodam.server.dto.AddressDTO;
import com.nodam.server.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AddressRepository {
    @Autowired
    private AddressMapper mapper;

    public String register(AddressDTO addressDTO) throws DuplicateKeyException{
        if (mapper.getWalletCount(addressDTO.getWalletAddress()) != 0)
            throw new DuplicateKeyException("Fail");
        mapper.register(addressDTO);
        return "Success";
    }

    public ArrayList<AddressDTO> getWalletList(String userId) {
        return mapper.getWalletList(userId);
    }

    public String getWalletCount(String walletAddress) {
        return ( mapper.getWalletCount(walletAddress) != 0 ? "True" : "False" );
    }
}
