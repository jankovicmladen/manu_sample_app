package com.example.menusampleapp.data.repository.venue;

import com.example.menusampleapp.data.model.SearchRequest;

public interface VenueDataSource {

    void getVenues(VenueRepository.LoadVenuesCallback callback, SearchRequest searchRequest);

}
