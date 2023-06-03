package com.nodam.server.repository;

import com.nodam.server.dto.RegisterDTO;
import com.nodam.server.dto.UserDTO;
import com.nodam.server.mapper.UserDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Repository
public class UserRepository {
    @Autowired
    private UserDTOMapper mapper;

    public int addWallet(RegisterDTO registerDTO) {
        return mapper.addWallet(registerDTO);
    }

//    public boolean checkWalletExist(String userId, String tokenId) {
//        return mapper.checkWalletExist(userId, tokenId);
//    }

    public Boolean checkWalletExist(String userId, int tokenId) {
        Boolean result = mapper.checkWalletExist(userId, tokenId);
        return result != null ? result : false;
    }

    public String checkWalletList(String userId) {
        return mapper.checkWalletList(userId);
    }

    public int insertUser(UserDTO user){
        if (mapper.getUserById(user.getUserId()) != null)
            return 0;
        mapper.insertUser(user);
        return 1;
    }


    public ArrayList<UserDTO> getAllUsers(){
        return mapper.getAllUsers();
    }

    public UserDTO getUserById(String userId){
        if (mapper.getUserById(userId) == null)
            return new UserDTO();
        return mapper.getUserById(userId);
    }

    public int updateUser(String userId, UserDTO userDTO) {
        if (mapper.getUserById(userId) == null)
            return 0;
        mapper.updateUser(userId, userDTO);
        return 1;
    }

    public int deleteUser(String userId) {
        if (mapper.getUserById(userId) == null)
            return 0;
        mapper.deleteUser(userId);
        return 1;
    }

    public boolean isUser(String userId) {
        if (mapper.getUserById(userId) == null)
            return false;
        return true;
    }

}
