package com.example.menusampleapp.ui.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.menusampleapp.R;
import com.example.menusampleapp.databinding.ActivityMainBinding;
import com.example.menusampleapp.ui.splash.SplashActivity;
import com.example.menusampleapp.utils.Preferences;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.tvLogout.setOnClickListener(view -> {
            Preferences.setAccessToken(null);
            SplashActivity.start(this);
        });
    }
}