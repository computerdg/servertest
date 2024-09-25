package com.example.test02;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ProfileResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private List<Profile> data;

    // Getters
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<Profile> getData() {
        return data;
    }
}
