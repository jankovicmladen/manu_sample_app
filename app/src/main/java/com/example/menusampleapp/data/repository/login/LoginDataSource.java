package com.example.menusampleapp.data.repository.login;

import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.repository.venue.VenueRepository;

public interface LoginDataSource {

    void login(LoginRepository.LoginCallback callback, LoginRequest loginRequest);

}
