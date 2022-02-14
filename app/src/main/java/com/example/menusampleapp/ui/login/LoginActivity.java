package com.example.menusampleapp.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.menusampleapp.data.DataManager;
import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.repository.login.LoginRepository;
import com.example.menusampleapp.databinding.ActivityLoginBinding;
import com.example.menusampleapp.databinding.ActivityMainBinding;
import com.example.menusampleapp.ui.main.MainActivity;
import com.example.menusampleapp.R;
import com.google.android.material.textfield.TextInputEditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    private LoginViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        viewModel = createViewModel(new LoginRequest());
        observeViewModel();

        setupUI();


    }

    private void setupUI() {
        binding.btnLogin.setOnClickListener(view -> {

            viewModel.setLoginRequest(new LoginRequest(binding.etUsername.getText().toString(),
                    binding.etPassword.getText().toString()));
            viewModel.login();

        });
    }

    public LoginViewModel createViewModel(LoginRequest loginRequest) {
        LoginRepository loginRepository = DataManager.getInstance().getLoginRepository();
        LoginViewModelFactory factory = new LoginViewModelFactory(loginRepository, loginRequest);
        return ViewModelProviders.of(this, factory).get(LoginViewModel.class);
    }

    public void observeViewModel() {

        viewModel.getNavigateToMainActivityLiveData().observe(this, loginResponse -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        viewModel.getShowErrorMessageLiveData().observe(this, s ->
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show());

        viewModel.getShowLoadingLiveData().observe(this, unused -> {

        });

        viewModel.getHideLoadingLiveData().observe(this, unused -> {

        });
    }

}