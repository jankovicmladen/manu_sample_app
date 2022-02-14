package com.example.menusampleapp.utils;



import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.example.menusampleapp.App;

public class Preferences {

    private static final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(App.get());

    public enum KEY {
        TOKEN

    }

    public static String getAccessToken() {
        return prefs.getString(KEY.TOKEN.toString(), null);
    }

    public static void setAccessToken(String token) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(KEY.TOKEN.toString(), token);
        editor.apply();
    }
}
