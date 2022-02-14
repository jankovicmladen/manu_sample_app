package com.example.menusampleapp.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.model.LoginResponse;
import com.example.menusampleapp.data.repository.login.LoginRepository;


public class LoginViewModel extends ViewModel {

    private final MutableLiveData<LoginResponse> loginResponseLiveData = new MutableLiveData<>();
    private final MutableLiveData<String> showErrorMessageLiveData = new MutableLiveData<>();
    private final MutableLiveData<Void> showLoadingLiveData = new MutableLiveData<>();
    private final MutableLiveData<Void> hideLoadingLiveData = new MutableLiveData<>();
    private final MutableLiveData<Void> navigateToMainActivityLiveData = new MutableLiveData<>();

    private final LoginRepository loginRepository;
    private LoginRequest loginRequest;

    private final LoginCallback movieCallback = new LoginCallback();

    LoginViewModel(LoginRepository loginRepository, LoginRequest loginRequest) {
        this.loginRepository = loginRepository;
        this.loginRequest = loginRequest;
    }

    public void setLoginRequest(LoginRequest loginRequest){
        this.loginRequest = loginRequest;
    }

    public void login() {
        setIsLoading(true);
        loginRepository.login(movieCallback, loginRequest);
    }

    private void setIsLoading(boolean loading) {
        if (loading) {
            showLoadingLiveData.postValue(null);
        } else {
            hideLoadingLiveData.postValue(null);
        }
    }

    private void setLoginResponseLiveData(LoginResponse loginResponse) {
        setIsLoading(false);
        this.loginResponseLiveData.postValue(loginResponse);
    }

    public void onSuccessLogin(){
        navigateToMainActivityLiveData.postValue(null);
    }



    /**
     * Callback
     **/
    private class LoginCallback implements LoginRepository.LoginCallback {

        @Override
        public void onLoggedIn(LoginResponse loginResponse) {
            onSuccessLogin();
        }

        @Override
        public void onError() {
            setIsLoading(false);
            showErrorMessageLiveData.postValue("Something Went Wrong!");
        }
    }

    /**
     * LiveData
     **/

    public LiveData<Void> getShowLoadingLiveData() {
        return showLoadingLiveData;
    }

    public LiveData<String> getShowErrorMessageLiveData() {
        return showErrorMessageLiveData;
    }

    public LiveData<Void> getHideLoadingLiveData() {
        return hideLoadingLiveData;
    }

    public LiveData<Void> getNavigateToMainActivityLiveData() {
        return navigateToMainActivityLiveData;
    }
}
