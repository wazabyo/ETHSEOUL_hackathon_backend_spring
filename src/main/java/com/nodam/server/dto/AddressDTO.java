package com.nodam.server.dto;

public class AddressDTO {
    private String userId;
    private String tokenId;
    private String walletAddress;

    public AddressDTO(String userId, String tokenId, String walletAddress) {
        this.userId = userId;
        this.tokenId = tokenId;
        this.walletAddress = walletAddress;
    }

    public AddressDTO() {
        userId = "";
        tokenId = "";
        this.walletAddress = "";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId='" + userId + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", walletAddress='" + walletAddress + '\'' +
                '}';
    }
}
