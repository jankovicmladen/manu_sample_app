package com.example.menusampleapp.data.repository.venue;


import com.example.menusampleapp.data.api.SampleApi;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.data.model.VenuesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VenueRemoteDataSource implements VenueDataSource {

    private static VenueRemoteDataSource instance;

    private final SampleApi sampleApi;

    private VenueRemoteDataSource(SampleApi sampleApi) {
        this.sampleApi = sampleApi;
    }

    public static VenueRemoteDataSource getInstance(SampleApi sampleApi) {
        if (instance == null) {
            instance = new VenueRemoteDataSource(sampleApi);
        }
        return instance;
    }

    @Override
    public void getVenues(VenueRepository.LoadVenuesCallback callback,SearchRequest searchRequest) {
        sampleApi.getVenues(searchRequest).enqueue(new Callback<VenuesResponse>() {
            @Override
            public void onResponse(Call<VenuesResponse> call, Response<VenuesResponse> response) {
                List<Venue> venues = response.body() !=null ? response.body().getData().getVenues() : null;
                if (venues!=null && !venues.isEmpty()){
                    callback.onVenuesLoaded(venues);
                }else
                    callback.onDataNotAvailable();
            }

            @Override
            public void onFailure(Call<VenuesResponse> call, Throwable t) {
                callback.onError();
            }
        });
    }
}
