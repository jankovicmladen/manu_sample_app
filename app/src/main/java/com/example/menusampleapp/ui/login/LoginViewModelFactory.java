package com.example.menusampleapp.ui.login;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.repository.login.LoginRepository;

public class LoginViewModelFactory implements ViewModelProvider.Factory{

    private final LoginRepository loginRepository;
    private final LoginRequest loginRequest;

    public LoginViewModelFactory(LoginRepository loginRepository, LoginRequest loginRequest) {
        this.loginRepository = loginRepository;
        this.loginRequest = loginRequest;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            return (T) new LoginViewModel(loginRepository, loginRequest);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
