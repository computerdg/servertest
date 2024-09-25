package com.example.test02;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String BASE_URL = "https://run.mocky.io/v3/8b4611a4-9569-4721-85b7-c23c958430e7/"; // Mocky 기본 URL

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiService apiService = ApiClient.getClient(BASE_URL).create(ApiService.class);

        Call<ProfileResponse> call = apiService.getProfiles();
        call.enqueue(new Callback<ProfileResponse>() {
            @Override
            public void onResponse(Call<ProfileResponse> call, Response<ProfileResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Profile> profiles = response.body().getData();
                    for (Profile profile : profiles) {
                        Log.d(TAG, "프로필 ID: " + profile.getProfileId());
                        Log.d(TAG, "닉네임: " + profile.getNickname());
                        Log.d(TAG, "성별: " + profile.getGender());
                        Log.d(TAG, "나이: " + profile.getAge());
                        Log.d(TAG, "운동 경력: " + profile.getWorkoutYears() + "년");
                        Log.d(TAG, "좋아요 수: " + profile.getLikeCount());
                        Log.d(TAG, "--------------------------");
                    }
                } else {
                    Log.d(TAG, "응답 실패, 코드: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<ProfileResponse> call, Throwable t) {
                Log.e(TAG, "네트워크 요청 실패: " + t.getMessage(), t);
            }
        });
    }
}

