package com.example.menusampleapp.data.repository.venue;


import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;

import java.util.List;


public class VenueRepositoryImpl implements VenueRepository {

    private final VenueDataSource venueRemote;

    private static VenueRepositoryImpl instance;

    private VenueRepositoryImpl(VenueRemoteDataSource movieRemote) {

        this.venueRemote = movieRemote;
    }

    public static VenueRepositoryImpl getInstance(VenueRemoteDataSource movieRemote) {
        if (instance == null) {
            instance = new VenueRepositoryImpl(movieRemote);
        }
        return instance;
    }

    @Override
    public void getVenues(LoadVenuesCallback callback, SearchRequest searchRequest) {
        venueRemote.getVenues(new LoadVenuesCallback() {

                                  @Override
                                  public void onVenuesLoaded(List<Venue> venues) {
                                      callback.onVenuesLoaded(venues);
                                  }

                                  @Override
                                  public void onDataNotAvailable() {
                                      callback.onDataNotAvailable();
                                  }

                                  @Override
                                  public void onError() {
                                      callback.onError();
                                  }
                              },
                searchRequest);
    }
}
