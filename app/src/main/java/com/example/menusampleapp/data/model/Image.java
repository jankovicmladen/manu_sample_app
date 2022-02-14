package com.example.menusampleapp.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Parcelable {
    @SerializedName("thumbnail_small")
    @Expose
    private String thumbnailSmall;
    @SerializedName("thumbnail_medium")
    @Expose
    private String thumbnailMedium;
    @SerializedName("fullsize")
    @Expose
    private String fullsize;

    public String getThumbnailSmall() {
        return thumbnailSmall;
    }

    public void setThumbnailSmall(String thumbnailSmall) {
        this.thumbnailSmall = thumbnailSmall;
    }

    public String getThumbnailMedium() {
        return thumbnailMedium;
    }

    public void setThumbnailMedium(String thumbnailMedium) {
        this.thumbnailMedium = thumbnailMedium;
    }

    public String getFullsize() {
        return fullsize;
    }

    public void setFullsize(String fullsize) {
        this.fullsize = fullsize;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.thumbnailSmall);
        dest.writeString(this.thumbnailMedium);
        dest.writeString(this.fullsize);
    }

    public void readFromParcel(Parcel source) {
        this.thumbnailSmall = source.readString();
        this.thumbnailMedium = source.readString();
        this.fullsize = source.readString();
    }

    public Image() {
    }

    protected Image(Parcel in) {
        this.thumbnailSmall = in.readString();
        this.thumbnailMedium = in.readString();
        this.fullsize = in.readString();
    }

    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel source) {
            return new Image(source);
        }

        @Override
        public Image[] newArray(int size) {
            return new Image[size];
        }
    };
}
