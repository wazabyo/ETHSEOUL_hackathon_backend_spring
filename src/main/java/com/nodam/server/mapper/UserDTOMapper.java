package com.nodam.server.mapper;

import com.nodam.server.dto.RegisterDTO;
import com.nodam.server.dto.UserDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
@Mapper
public interface UserDTOMapper {
        @Update("UPDATE `db`.`user` SET jsonObject = JSON_SET(jsonObject, concat('$.' , #{tokenId}), #{walletAddress}) WHERE userId = #{userId}")
        public int addWallet(@RequestBody RegisterDTO registerDTO);

        @Select("SELECT JSON_CONTAINS_PATH(jsonObject, concat('$.', CAST(#{tokenId} AS CHAR))) FROM `db`.`user` WHERE userId = #{userId}")
        public Boolean checkWalletExist(@Param("userId") String userId, @Param("tokenId") int tokenId);

        @Select("SELECT * FROM user WHERE userId=#{userId};")
        String checkWalletList(String userId);

        @Insert("INSERT INTO `db`.`user` (`userId`, `jsonObject`) VALUES (#{userId}, #{jsonObject}); ")
        public int insertUser(@RequestBody UserDTO user);

        @Select("SELECT * FROM user;")
        public ArrayList<UserDTO> getAllUsers();

        @Select("SELECT * FROM user WHERE userId=#{userId};")
        public UserDTO getUserById(@Param("userId") String userId);

        @Update("UPDATE `db`.`user` SET `jsonObject` = #{user.jsonObject} ;")
        public int updateUser(@Param("userId") String userId, UserDTO userDTO);

        @Delete("DELETE FROM `db`.`user` WHERE (`userId` = #{userId});")
        public int deleteUser(@Param("userId") String userId);

}
