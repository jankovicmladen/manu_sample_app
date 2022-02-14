package com.example.menusampleapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token {
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
    @SerializedName("refresh_ttl")
    @Expose
    private Integer refreshTtl;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Integer getRefreshTtl() {
        return refreshTtl;
    }

    public void setRefreshTtl(Integer refreshTtl) {
        this.refreshTtl = refreshTtl;
    }
}
