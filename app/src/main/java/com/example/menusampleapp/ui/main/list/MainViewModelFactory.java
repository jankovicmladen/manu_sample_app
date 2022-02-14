package com.example.menusampleapp.ui.main.list;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.repository.venue.VenueRepository;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private final VenueRepository venueRepository;
    private final SearchRequest searchRequest;

    public MainViewModelFactory(VenueRepository moviesRepository, SearchRequest searchRequest) {
        this.venueRepository = moviesRepository;
        this.searchRequest = searchRequest;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(venueRepository, searchRequest);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }


}
