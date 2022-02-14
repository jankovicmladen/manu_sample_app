package com.example.menusampleapp.ui.main.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.data.repository.venue.VenueRepository;

import java.util.List;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<List<Venue>> venuesLiveData = new MutableLiveData<>();
    private final MutableLiveData<String> showErrorMessageLiveData = new MutableLiveData<>();
    private final MutableLiveData<Void> showLoadingLiveData = new MutableLiveData<>();
    private final MutableLiveData<Void> hideLoadingLiveData = new MutableLiveData<>();

    private final VenueRepository venuesRepository;
    private final SearchRequest searchRequest;

    private final VenuesCallback movieCallback = new VenuesCallback();

    MainViewModel(VenueRepository venuesRepository, SearchRequest searchRequest) {
        this.venuesRepository = venuesRepository;
        this.searchRequest = searchRequest;
    }

    public void loadMovies() {
        setIsLoading(true);
        venuesRepository.getVenues(movieCallback, searchRequest);
    }

    private void setIsLoading(boolean loading) {
        if (loading) {
            showLoadingLiveData.postValue(null);
        } else {
            hideLoadingLiveData.postValue(null);
        }
    }

    private void setVenuesLiveData(List<Venue> venuesLiveData) {
        setIsLoading(false);
        this.venuesLiveData.postValue(venuesLiveData);
    }

    /**
     * Callback
     **/
    private class VenuesCallback implements VenueRepository.LoadVenuesCallback {

        @Override
        public void onVenuesLoaded(List<Venue> venues) {
            setVenuesLiveData(venues);
        }

        @Override
        public void onDataNotAvailable() {
            setIsLoading(false);
            showErrorMessageLiveData.postValue("There is not items!");
        }

        @Override
        public void onError() {
            setIsLoading(false);
            showErrorMessageLiveData.postValue("Something Went Wrong!");
        }
    }

    /**
     * LiveData
     **/
    public LiveData<List<Venue>> getVenuesLiveData() {
        return venuesLiveData;
    }

    public LiveData<Void> getShowLoadingLiveData() {
        return showLoadingLiveData;
    }

    public LiveData<Void> getHideLoadingLiveData() {
        return hideLoadingLiveData;
    }
}
