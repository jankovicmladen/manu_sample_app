package com.example.menusampleapp.data.api;


import com.example.menusampleapp.data.model.LoginRequest;
import com.example.menusampleapp.data.model.LoginResponse;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.data.model.VenuesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SampleApi {

    @POST("customers/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);

    @POST("directory/search")
    Call<VenuesResponse> getVenues(@Body SearchRequest searchRequest);
}
