package com.example.menusampleapp.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue implements Parcelable {
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("distance_in_miles")
    @Expose
    private Double distanceInMiles;
    @SerializedName("venue")
    @Expose
    private VenueInfo venue;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(Double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public VenueInfo getVenue() {
        return venue;
    }

    public void setVenue(VenueInfo venue) {
        this.venue = venue;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.distance);
        dest.writeValue(this.distanceInMiles);
        dest.writeParcelable(this.venue, flags);
    }

    public void readFromParcel(Parcel source) {
        this.distance = (Double) source.readValue(Double.class.getClassLoader());
        this.distanceInMiles = (Double) source.readValue(Double.class.getClassLoader());
        this.venue = source.readParcelable(VenueInfo.class.getClassLoader());
    }

    public Venue() {
    }

    protected Venue(Parcel in) {
        this.distance = (Double) in.readValue(Double.class.getClassLoader());
        this.distanceInMiles = (Double) in.readValue(Double.class.getClassLoader());
        this.venue = in.readParcelable(VenueInfo.class.getClassLoader());
    }

    public static final Parcelable.Creator<Venue> CREATOR = new Parcelable.Creator<Venue>() {
        @Override
        public Venue createFromParcel(Parcel source) {
            return new Venue(source);
        }

        @Override
        public Venue[] newArray(int size) {
            return new Venue[size];
        }
    };
}
