package com.nodam.server.dto;

import java.time.LocalDateTime;

public class UserDTO {
    private String userId;
    private String jsonObject;

    public UserDTO() {
        userId = "";
        jsonObject = "";
    }

    public UserDTO(String userId, String jsonObject) {
        this.userId = userId;
        this.jsonObject = jsonObject;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(String jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                ", userId='" + userId + '\'' +
                ", jsonObject='" + jsonObject + '\'' +
                '}';
    }
}
