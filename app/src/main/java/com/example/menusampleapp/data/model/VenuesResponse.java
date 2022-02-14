package com.example.menusampleapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenuesResponse {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("data")
    @Expose
    private VenuesData data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public VenuesData getData() {
        return data;
    }

    public void setData(VenuesData data) {
        this.data = data;
    }

}
