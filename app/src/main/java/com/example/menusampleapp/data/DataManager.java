package com.example.menusampleapp.data;

import com.example.menusampleapp.data.api.SampleApi;
import com.example.menusampleapp.data.repository.login.LoginDataSourceImpl;
import com.example.menusampleapp.data.repository.login.LoginRepository;
import com.example.menusampleapp.data.repository.login.LoginRepositoryImpl;
import com.example.menusampleapp.data.repository.venue.VenueDataSource;
import com.example.menusampleapp.data.repository.venue.VenueRemoteDataSource;
import com.example.menusampleapp.data.repository.venue.VenueRepository;
import com.example.menusampleapp.data.repository.venue.VenueRepositoryImpl;
import com.example.menusampleapp.data.service.RetrofitService;

public class DataManager {

    private static DataManager sInstance;

    private DataManager() {
        // This class is not publicly instantiable
    }

    public static synchronized DataManager getInstance() {
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }


    public VenueRepository getVenueRepository() {

        SampleApi sampleApi = RetrofitService.getInstance().getSampleApi();
        VenueRemoteDataSource venueDataSource = VenueRemoteDataSource.getInstance(sampleApi);

        return VenueRepositoryImpl.getInstance(venueDataSource);
    }

    public LoginRepository getLoginRepository(){

        SampleApi sampleApi = RetrofitService.getInstance().getSampleApi();
        LoginDataSourceImpl loginDataSource = LoginDataSourceImpl.getInstance(sampleApi);

        return LoginRepositoryImpl.getInstance(loginDataSource);
    }

}
