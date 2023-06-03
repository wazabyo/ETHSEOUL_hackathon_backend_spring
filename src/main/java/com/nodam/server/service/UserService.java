package com.nodam.server.service;

import com.nodam.server.dto.RegisterDTO;
import com.nodam.server.dto.UserDTO;
import com.nodam.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public int register(RegisterDTO registerDTO) {
        if (!userRepository.isUser(registerDTO.getUserId())){
//            UserDTO newUser = new UserDTO(registerDTO.getUserId(),
//                    "\"{" + String.valueOf(registerDTO.getTokenId()) + ":" +
//                            "'" + registerDTO.getWalletAddress() + "'}\""
//                    );
            UserDTO newUser = new UserDTO(registerDTO.getUserId(), "{}");
            userRepository.insertUser(newUser);
        }
        return userRepository.addWallet(registerDTO);
    }

    public Boolean checkWalletExist(String userId, int tokenId) {
        return userRepository.checkWalletExist(userId, tokenId);
    }

    public String checkWalletList(String userId) {
        return userRepository.checkWalletList(userId);
    }

    public int insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }

    public ArrayList<UserDTO> getAllUsers(){
        ArrayList<UserDTO> users = userRepository.getAllUsers();
        if (users.size() == 0)
            return new ArrayList<>();
        return users;
    }

    public UserDTO getUserById(String userId){
        return userRepository.getUserById(userId);
    }

    public int updateUser(String userId, UserDTO user){
        return userRepository.updateUser(userId, user);
    }

    public int deleteUser(String userId){
        return userRepository.deleteUser(userId);
    }

}
