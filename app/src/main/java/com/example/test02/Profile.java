package com.example.test02;

import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("profileId")
    private int profileId;

    @SerializedName("image")
    private String image;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("gender")
    private String gender;

    @SerializedName("age")
    private int age;

    @SerializedName("workoutYears")
    private int workoutYears;

    @SerializedName("likeCount")
    private int likeCount;

    // Getters
    public int getProfileId() {
        return profileId;
    }

    public String getImage() {
        return image;
    }

    public String getNickname() {
        return nickname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWorkoutYears() {
        return workoutYears;
    }

    public int getLikeCount() {
        return likeCount;
    }
}
