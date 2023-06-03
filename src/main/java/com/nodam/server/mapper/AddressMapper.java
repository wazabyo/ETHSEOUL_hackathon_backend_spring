package com.nodam.server.mapper;

import com.nodam.server.dto.AddressDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Mapper
public interface AddressMapper {
        @Insert("INSERT INTO `db`.`address` VALUES (null, #{walletAddress}, #{tokenId}, #{userId})")
        public int register(@RequestBody AddressDTO addressDTO);

        @Select("SELECT #{userId} FROM `db`.`address` WHERE walletAddress = #{walletAddress}")
        public Boolean isWalletExist(@Param("walletAddress") String walletAddress);

        @Select("SELECT * FROM `db`.`address` WHERE userId=#{userId};")
        public ArrayList<AddressDTO> getWalletList(@Param("userId") String userId);

}
