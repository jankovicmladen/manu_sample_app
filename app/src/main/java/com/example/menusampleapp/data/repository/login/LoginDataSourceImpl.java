package com.example.menusampleapp.data.repository.login;


import com.example.menusampleapp.data.api.SampleApi;
import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.model.LoginResponse;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.data.repository.venue.VenueDataSource;
import com.example.menusampleapp.data.repository.venue.VenueRepository;
import com.example.menusampleapp.utils.Preferences;

import java.util.List;
import java.util.function.Predicate;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginDataSourceImpl implements LoginDataSource {

    private static LoginDataSourceImpl instance;

    private final SampleApi sampleApi;

    private LoginDataSourceImpl(SampleApi sampleApi) {
        this.sampleApi = sampleApi;
    }

    public static LoginDataSourceImpl getInstance(SampleApi sampleApi) {
        if (instance == null) {
            instance = new LoginDataSourceImpl(sampleApi);
        }
        return instance;
    }

    @Override
    public void login(LoginRepository.LoginCallback callback, LoginRequest loginRequest) {
        sampleApi.login(loginRequest).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    callback.onLoggedIn(response.body());
                    Preferences.setAccessToken(response.body().getData().getToken().getValue());
                } else {
                    callback.onError();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                callback.onError();
            }
        });
    }
}
