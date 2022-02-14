package com.example.menusampleapp.ui.main.list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.menusampleapp.R;
import com.example.menusampleapp.data.DataManager;
import com.example.menusampleapp.data.model.SearchRequest;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.data.repository.venue.VenueRepository;
import com.example.menusampleapp.databinding.ListFragmentBinding;

import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ListFragment extends Fragment implements ListAdapter.OnItemClickListener {


    public static final String LONGITUDE = "21.26907";
    public static final String LATITUDE = "44.001783";

    private MainViewModel mViewModel;

    private ListAdapter adapter;

    private ListFragmentBinding binding;

    public ListFragment() {
        // Required empty public constructor
    }


    public static ListFragment newInstance() {

        return new ListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = ListFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        setupRecyclerView();

        return view;
    }

    private void setupRecyclerView() {
        adapter = new ListAdapter(new ArrayList<>(), this);
        binding.rvList.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvList.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewModel = createViewModel();
        observeViewModel();

        mViewModel.loadMovies();
    }

    public MainViewModel createViewModel() {

        VenueRepository venueRepository = DataManager.getInstance().getVenueRepository();
        SearchRequest searchRequest = new SearchRequest(LATITUDE, LONGITUDE);
        MainViewModelFactory factory = new MainViewModelFactory(venueRepository, searchRequest);
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }

    public void observeViewModel() {

        mViewModel.getShowLoadingLiveData().observe(getViewLifecycleOwner(), unused -> {
            if (Objects.requireNonNull(binding.rvList.getAdapter()).getItemCount()==0)
            binding.flProgress.setVisibility(View.VISIBLE);
        });

        mViewModel.getHideLoadingLiveData().observe(getViewLifecycleOwner(), unused -> {
            binding.flProgress.setVisibility(View.GONE);
        });

        mViewModel.getVenuesLiveData().observe(getViewLifecycleOwner(), venues -> {
            adapter.addAll(venues, true);
        });
    }

    @Override
    public void onItemClick(int position, Venue venue) {

        NavController navController = NavHostFragment.findNavController(this);
        ListFragmentDirections.ActionListFragmentToDetailsFragment action =
                ListFragmentDirections.actionListFragmentToDetailsFragment(venue);
        action.setVenue(venue);

        navController.navigate(action);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}