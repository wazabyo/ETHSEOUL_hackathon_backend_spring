package com.nodam.server.mapper;

import com.nodam.server.dto.AddressDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Mapper
public interface AddressMapper {
        @Insert("INSERT INTO `db`.`address` VALUES (null, LOWER(#{walletAddress}), #{tokenId}, #{userId})")
        public int register(@RequestBody AddressDTO addressDTO);

        @Select("SELECT * FROM `db`.`address` WHERE userId=#{userId};")
        public ArrayList<AddressDTO> getWalletList(@Param("userId") String userId);

        @Select("SELECT COUNT(walletAddress) FROM `db`.`address` WHERE walletAddress = LOWER(#{walletAddress})")
        public int getWalletCount(@Param("walletAddress") String walletAddress);

}
