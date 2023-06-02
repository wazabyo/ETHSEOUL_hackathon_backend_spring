package com.nodam.server.dto;

import java.time.LocalDateTime;

public class UserDTO {
    private int id;
    private String userId;
    private String jsonObject;

    public UserDTO() {
        id = -1;
        userId = "";
        jsonObject = "";
    }

    public UserDTO(int id, String userId, String jsonObject) {
        this.id = id;
        this.userId = userId;
        this.jsonObject = jsonObject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", jsonObject='" + jsonObject + '\'' +
                '}';
    }
}
