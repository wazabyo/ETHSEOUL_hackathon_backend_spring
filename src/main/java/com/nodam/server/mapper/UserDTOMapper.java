package com.nodam.server.mapper;

import com.nodam.server.dto.UserDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Mapper
public interface UserDTOMapper {

        @Insert("INSERT INTO `db`.`user` (`id`, `userId`, `jsonObject`) VALUES (#{id}, #{userId}, #{jsonObject}); ")
        public int insertUser(@RequestBody UserDTO user);

        @Select("SELECT * FROM user;")
        public ArrayList<UserDTO> getAllUsers();

        @Select("SELECT * FROM user WHERE id=#{id};")
        public UserDTO getUserById(@Param("id") String id);

        @Update("UPDATE `db`.`user` SET `jsonObject` = #{user.jsonObject} ;")
        public int updateUser(@Param("id") String id, UserDTO userDTO);

        @Delete("DELETE FROM `db`.`user` WHERE (`id` = #{id});")
        public int deleteUser(@Param("id") String id);

}
