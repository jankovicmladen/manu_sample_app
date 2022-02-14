package com.example.menusampleapp.ui.main.details;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.menusampleapp.R;
import com.example.menusampleapp.data.model.Venue;
import com.example.menusampleapp.databinding.FragmentDetailsBinding;


public class DetailsFragment extends Fragment {

    private FragmentDetailsBinding binding;

    public DetailsFragment() {
    }


    public static DetailsFragment newInstance() {
        return new DetailsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailsBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Venue venue = DetailsFragmentArgs.fromBundle(getArguments()).getVenue();

        binding.tvName.setText(venue.getVenue().getName());
        binding.tvDescription.setText(venue.getVenue().getDescription());
        binding.tvWelcomeMessage.setText(venue.getVenue().getWelcomeMessage());
        binding.tvOpen.setText(venue.getVenue().getIsOpen() ? "Open" : "Close");

        if (venue.getVenue().getImage() != null && venue.getVenue().getImage().getThumbnailMedium() != null) {
            Glide.with(this)
                    .load(venue.getVenue().getImage().getThumbnailMedium())
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            binding.pbImageLoader.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            binding.pbImageLoader.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .into(binding.ivImage);
        } else {
            binding.pbImageLoader.setVisibility(View.GONE);
            Glide.with(this)
                    .load(R.drawable.placeholder)
                    .into(binding.ivImage);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}