package com.example.menusampleapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CustomerAccount {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("reference_type")
    @Expose
    private String referenceType;
    @SerializedName("customer_id")
    @Expose
    private Integer customerId;
    @SerializedName("brand_id")
    @Expose
    private Integer brandId;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("demographics")
    @Expose
    private List<Object> demographics = null;
    @SerializedName("optin_status_email")
    @Expose
    private Integer optinStatusEmail;
    @SerializedName("optin_status_pn")
    @Expose
    private Integer optinStatusPn;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<Object> getDemographics() {
        return demographics;
    }

    public void setDemographics(List<Object> demographics) {
        this.demographics = demographics;
    }

    public Integer getOptinStatusEmail() {
        return optinStatusEmail;
    }

    public void setOptinStatusEmail(Integer optinStatusEmail) {
        this.optinStatusEmail = optinStatusEmail;
    }

    public Integer getOptinStatusPn() {
        return optinStatusPn;
    }

    public void setOptinStatusPn(Integer optinStatusPn) {
        this.optinStatusPn = optinStatusPn;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
