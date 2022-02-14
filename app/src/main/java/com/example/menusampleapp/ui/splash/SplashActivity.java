package com.example.menusampleapp.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.menusampleapp.R;
import com.example.menusampleapp.ui.login.LoginActivity;
import com.example.menusampleapp.ui.main.MainActivity;
import com.example.menusampleapp.utils.Preferences;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if (Preferences.getAccessToken() == null) {
            startActivity(new Intent(this, LoginActivity.class));
        } else {
            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, SplashActivity.class);
        starter.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(starter);
    }
}