package com.nodam.server.dto;

public class RegisterDTO {
    String userId;
    String tokenId;
    String walletAddress;

    public RegisterDTO() {
        userId = "";
        tokenId = "";
        walletAddress = "";
    }

    public RegisterDTO(String userId, String tokenId, String walletAddress) {
        this.userId = userId;
        this.tokenId = tokenId;
        this.walletAddress = walletAddress;
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

}
