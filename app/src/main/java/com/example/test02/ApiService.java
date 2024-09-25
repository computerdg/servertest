package com.example.test02;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/v3/8b4611a4-9569-4721-85b7-c23c958430e7")  // Mocky URL의 경로를 사용합니다.
    Call<ProfileResponse> getProfiles();
}
