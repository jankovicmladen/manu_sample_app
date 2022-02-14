package com.example.menusampleapp.data.repository.login;


import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.model.LoginResponse;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.data.repository.venue.VenueDataSource;
import com.example.menusampleapp.data.repository.venue.VenueRemoteDataSource;
import com.example.menusampleapp.data.repository.venue.VenueRepository;

import java.util.List;


public class LoginRepositoryImpl implements LoginRepository {

    private final LoginDataSource loginDataSource;

    private static LoginRepositoryImpl instance;

    private LoginRepositoryImpl(LoginDataSource loginDataSource) {

        this.loginDataSource = loginDataSource;
    }

    public static LoginRepositoryImpl getInstance(LoginDataSourceImpl loginDataSource) {
        if (instance == null) {
            instance = new LoginRepositoryImpl(loginDataSource);
        }
        return instance;
    }


    @Override
    public void login(LoginCallback callback, LoginRequest loginRequest) {
        loginDataSource.login(new LoginCallback() {
            @Override
            public void onLoggedIn(LoginResponse loginResponse) {
                callback.onLoggedIn(loginResponse);
            }

            @Override
            public void onError() {
                callback.onError();
            }
        }, loginRequest);
    }
}
