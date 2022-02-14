package com.example.menusampleapp.data.repository.venue;

import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;

import java.util.List;

public interface VenueRepository {

    interface LoadVenuesCallback {
        void onVenuesLoaded(List<Venue> venues);
        void onDataNotAvailable();
        void onError();
    }

    void getVenues(LoadVenuesCallback callback, SearchRequest searchRequest);

}
