package com.example.menusampleapp.data.repository.login;

import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.model.LoginResponse;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;

import java.util.List;

public interface LoginRepository {

    interface LoginCallback {
        void onLoggedIn(LoginResponse loginResponse);
        void onError();
    }

    void login(LoginCallback callback, LoginRequest loginRequest);

}
