package com.example.menusampleapp.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class VenueInfo implements Parcelable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("parent_type")
    @Expose
    private String parentType;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("currency_id")
    @Expose
    private Integer currencyId;
    @SerializedName("language_id")
    @Expose
    private Integer languageId;
    @SerializedName("brand_id")
    @Expose
    private Integer brandId;
    @Expose
    private String description;
    @SerializedName("kiosk_receipt_footer")
    @Expose
    private String kioskReceiptFooter;
    @SerializedName("imprint")
    @Expose
    private String imprint;
    @SerializedName("welcome_message")
    @Expose
    private String welcomeMessage;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("tax_number")
    @Expose
    private String taxNumber;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("used_price_configurations")
    @Expose
    private List<Integer> usedPriceConfigurations = null;
    @SerializedName("cuisine")
    @Expose
    private String cuisine;
    @SerializedName("is_shown_in_directory")
    @Expose
    private Boolean isShownInDirectory;
    @SerializedName("allow_item_comments")
    @Expose
    private Boolean allowItemComments;
    @SerializedName("tip_default")
    @Expose
    private Integer tipDefault;
    @SerializedName("tip_max")
    @Expose
    private Integer tipMax;
    @SerializedName("service_charge")
    @Expose
    private Integer serviceCharge;
    @SerializedName("pickup_time")
    @Expose
    private Integer pickupTime;
    @SerializedName("is_pickup_on_open_allowed")
    @Expose
    private Boolean isPickupOnOpenAllowed;
    @SerializedName("calculation_method")
    @Expose
    private String calculationMethod;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("is_open")
    @Expose
    private Boolean isOpen;
    @SerializedName("will_open")
    @Expose
    private Boolean willOpen;
    @SerializedName("has_discounts")
    @Expose
    private Boolean hasDiscounts;
    @SerializedName("has_loyalty")
    @Expose
    private Boolean hasLoyalty;
    @SerializedName("has_promotions")
    @Expose
    private Boolean hasPromotions;
    @SerializedName("has_delivery_integration")
    @Expose
    private Boolean hasDeliveryIntegration;
    @SerializedName("delivery_travel_type")
    @Expose
    private String deliveryTravelType;
    @SerializedName("is_calculated_delivery_buffer_used")
    @Expose
    private Boolean isCalculatedDeliveryBufferUsed;
    @SerializedName("is_monitoring_enabled")
    @Expose
    private Boolean isMonitoringEnabled;
    @SerializedName("is_threeds_enabled")
    @Expose
    private Boolean isThreedsEnabled;
    @SerializedName("is_fraud_detection_enabled")
    @Expose
    private Boolean isFraudDetectionEnabled;
    @SerializedName("is_smart_orders_enabled")
    @Expose
    private Boolean isSmartOrdersEnabled;
    @SerializedName("is_order_regret_enabled")
    @Expose
    private Boolean isOrderRegretEnabled;
    @SerializedName("default_delivery_buffer")
    @Expose
    private Integer defaultDeliveryBuffer;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKioskReceiptFooter() {
        return kioskReceiptFooter;
    }

    public void setKioskReceiptFooter(String kioskReceiptFooter) {
        this.kioskReceiptFooter = kioskReceiptFooter;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Integer> getUsedPriceConfigurations() {
        return usedPriceConfigurations;
    }

    public void setUsedPriceConfigurations(List<Integer> usedPriceConfigurations) {
        this.usedPriceConfigurations = usedPriceConfigurations;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public Boolean getIsShownInDirectory() {
        return isShownInDirectory;
    }

    public void setIsShownInDirectory(Boolean isShownInDirectory) {
        this.isShownInDirectory = isShownInDirectory;
    }

    public Boolean getAllowItemComments() {
        return allowItemComments;
    }

    public void setAllowItemComments(Boolean allowItemComments) {
        this.allowItemComments = allowItemComments;
    }

    public Integer getTipDefault() {
        return tipDefault;
    }

    public void setTipDefault(Integer tipDefault) {
        this.tipDefault = tipDefault;
    }

    public Integer getTipMax() {
        return tipMax;
    }

    public void setTipMax(Integer tipMax) {
        this.tipMax = tipMax;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Integer getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Integer pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Boolean getIsPickupOnOpenAllowed() {
        return isPickupOnOpenAllowed;
    }

    public void setIsPickupOnOpenAllowed(Boolean isPickupOnOpenAllowed) {
        this.isPickupOnOpenAllowed = isPickupOnOpenAllowed;
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getWillOpen() {
        return willOpen;
    }

    public void setWillOpen(Boolean willOpen) {
        this.willOpen = willOpen;
    }

    public Boolean getHasDiscounts() {
        return hasDiscounts;
    }

    public void setHasDiscounts(Boolean hasDiscounts) {
        this.hasDiscounts = hasDiscounts;
    }

    public Boolean getHasLoyalty() {
        return hasLoyalty;
    }

    public void setHasLoyalty(Boolean hasLoyalty) {
        this.hasLoyalty = hasLoyalty;
    }

    public Boolean getHasPromotions() {
        return hasPromotions;
    }

    public void setHasPromotions(Boolean hasPromotions) {
        this.hasPromotions = hasPromotions;
    }

    public Boolean getHasDeliveryIntegration() {
        return hasDeliveryIntegration;
    }

    public void setHasDeliveryIntegration(Boolean hasDeliveryIntegration) {
        this.hasDeliveryIntegration = hasDeliveryIntegration;
    }

    public String getDeliveryTravelType() {
        return deliveryTravelType;
    }

    public void setDeliveryTravelType(String deliveryTravelType) {
        this.deliveryTravelType = deliveryTravelType;
    }

    public Boolean getIsCalculatedDeliveryBufferUsed() {
        return isCalculatedDeliveryBufferUsed;
    }

    public void setIsCalculatedDeliveryBufferUsed(Boolean isCalculatedDeliveryBufferUsed) {
        this.isCalculatedDeliveryBufferUsed = isCalculatedDeliveryBufferUsed;
    }

    public Boolean getIsMonitoringEnabled() {
        return isMonitoringEnabled;
    }

    public void setIsMonitoringEnabled(Boolean isMonitoringEnabled) {
        this.isMonitoringEnabled = isMonitoringEnabled;
    }

    public Boolean getIsThreedsEnabled() {
        return isThreedsEnabled;
    }

    public void setIsThreedsEnabled(Boolean isThreedsEnabled) {
        this.isThreedsEnabled = isThreedsEnabled;
    }

    public Boolean getIsFraudDetectionEnabled() {
        return isFraudDetectionEnabled;
    }

    public void setIsFraudDetectionEnabled(Boolean isFraudDetectionEnabled) {
        this.isFraudDetectionEnabled = isFraudDetectionEnabled;
    }

    public Boolean getIsSmartOrdersEnabled() {
        return isSmartOrdersEnabled;
    }

    public void setIsSmartOrdersEnabled(Boolean isSmartOrdersEnabled) {
        this.isSmartOrdersEnabled = isSmartOrdersEnabled;
    }

    public Boolean getIsOrderRegretEnabled() {
        return isOrderRegretEnabled;
    }

    public void setIsOrderRegretEnabled(Boolean isOrderRegretEnabled) {
        this.isOrderRegretEnabled = isOrderRegretEnabled;
    }

    public Integer getDefaultDeliveryBuffer() {
        return defaultDeliveryBuffer;
    }

    public void setDefaultDeliveryBuffer(Integer defaultDeliveryBuffer) {
        this.defaultDeliveryBuffer = defaultDeliveryBuffer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public VenueInfo() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.code);
        dest.writeString(this.parentType);
        dest.writeValue(this.parentId);
        dest.writeValue(this.companyId);
        dest.writeValue(this.countryId);
        dest.writeValue(this.currencyId);
        dest.writeValue(this.languageId);
        dest.writeValue(this.brandId);
        dest.writeString(this.description);
        dest.writeString(this.kioskReceiptFooter);
        dest.writeString(this.imprint);
        dest.writeString(this.welcomeMessage);
        dest.writeString(this.address);
        dest.writeValue(this.state);
        dest.writeString(this.city);
        dest.writeString(this.zip);
        dest.writeValue(this.latitude);
        dest.writeValue(this.longitude);
        dest.writeString(this.taxNumber);
        dest.writeString(this.phone);
        dest.writeList(this.usedPriceConfigurations);
        dest.writeString(this.cuisine);
        dest.writeValue(this.isShownInDirectory);
        dest.writeValue(this.allowItemComments);
        dest.writeValue(this.tipDefault);
        dest.writeValue(this.tipMax);
        dest.writeValue(this.serviceCharge);
        dest.writeValue(this.pickupTime);
        dest.writeValue(this.isPickupOnOpenAllowed);
        dest.writeString(this.calculationMethod);
        dest.writeParcelable(this.image, flags);
        dest.writeValue(this.isOpen);
        dest.writeValue(this.willOpen);
        dest.writeValue(this.hasDiscounts);
        dest.writeValue(this.hasLoyalty);
        dest.writeValue(this.hasPromotions);
        dest.writeValue(this.hasDeliveryIntegration);
        dest.writeString(this.deliveryTravelType);
        dest.writeValue(this.isCalculatedDeliveryBufferUsed);
        dest.writeValue(this.isMonitoringEnabled);
        dest.writeValue(this.isThreedsEnabled);
        dest.writeValue(this.isFraudDetectionEnabled);
        dest.writeValue(this.isSmartOrdersEnabled);
        dest.writeValue(this.isOrderRegretEnabled);
        dest.writeValue(this.defaultDeliveryBuffer);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public void readFromParcel(Parcel source) {
        this.id = (Integer) source.readValue(Integer.class.getClassLoader());
        this.name = source.readString();
        this.code = source.readString();
        this.parentType = source.readString();
        this.parentId = (Integer) source.readValue(Integer.class.getClassLoader());
        this.companyId = (Integer) source.readValue(Integer.class.getClassLoader());
        this.countryId = (Integer) source.readValue(Integer.class.getClassLoader());
        this.currencyId = (Integer) source.readValue(Integer.class.getClassLoader());
        this.languageId = (Integer) source.readValue(Integer.class.getClassLoader());
        this.brandId = (Integer) source.readValue(Integer.class.getClassLoader());
        this.description = source.readString();
        this.kioskReceiptFooter = source.readString();
        this.imprint = source.readString();
        this.welcomeMessage = source.readString();
        this.address = source.readString();
        this.state = (Integer) source.readValue(Integer.class.getClassLoader());
        this.city = source.readString();
        this.zip = source.readString();
        this.latitude = (Double) source.readValue(Double.class.getClassLoader());
        this.longitude = (Double) source.readValue(Double.class.getClassLoader());
        this.taxNumber = source.readString();
        this.phone = source.readString();
        this.usedPriceConfigurations = new ArrayList<Integer>();
        source.readList(this.usedPriceConfigurations, Integer.class.getClassLoader());
        this.cuisine = source.readString();
        this.isShownInDirectory = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.allowItemComments = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.tipDefault = (Integer) source.readValue(Integer.class.getClassLoader());
        this.tipMax = (Integer) source.readValue(Integer.class.getClassLoader());
        this.serviceCharge = (Integer) source.readValue(Integer.class.getClassLoader());
        this.pickupTime = (Integer) source.readValue(Integer.class.getClassLoader());
        this.isPickupOnOpenAllowed = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.calculationMethod = source.readString();
        this.image = source.readParcelable(Image.class.getClassLoader());
        this.isOpen = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.willOpen = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.hasDiscounts = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.hasLoyalty = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.hasPromotions = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.hasDeliveryIntegration = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.deliveryTravelType = source.readString();
        this.isCalculatedDeliveryBufferUsed = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.isMonitoringEnabled = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.isThreedsEnabled = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.isFraudDetectionEnabled = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.isSmartOrdersEnabled = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.isOrderRegretEnabled = (Boolean) source.readValue(Boolean.class.getClassLoader());
        this.defaultDeliveryBuffer = (Integer) source.readValue(Integer.class.getClassLoader());
        this.createdAt = source.readString();
        this.updatedAt = source.readString();
    }

    protected VenueInfo(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.code = in.readString();
        this.parentType = in.readString();
        this.parentId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.companyId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.countryId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.currencyId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.languageId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.brandId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.description = in.readString();
        this.kioskReceiptFooter = in.readString();
        this.imprint = in.readString();
        this.welcomeMessage = in.readString();
        this.address = in.readString();
        this.state = (Integer) in.readValue(Integer.class.getClassLoader());
        this.city = in.readString();
        this.zip = in.readString();
        this.latitude = (Double) in.readValue(Double.class.getClassLoader());
        this.longitude = (Double) in.readValue(Double.class.getClassLoader());
        this.taxNumber = in.readString();
        this.phone = in.readString();
        this.usedPriceConfigurations = new ArrayList<Integer>();
        in.readList(this.usedPriceConfigurations, Integer.class.getClassLoader());
        this.cuisine = in.readString();
        this.isShownInDirectory = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.allowItemComments = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.tipDefault = (Integer) in.readValue(Integer.class.getClassLoader());
        this.tipMax = (Integer) in.readValue(Integer.class.getClassLoader());
        this.serviceCharge = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pickupTime = (Integer) in.readValue(Integer.class.getClassLoader());
        this.isPickupOnOpenAllowed = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.calculationMethod = in.readString();
        this.image = in.readParcelable(Image.class.getClassLoader());
        this.isOpen = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.willOpen = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hasDiscounts = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hasLoyalty = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hasPromotions = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hasDeliveryIntegration = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.deliveryTravelType = in.readString();
        this.isCalculatedDeliveryBufferUsed = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isMonitoringEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isThreedsEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isFraudDetectionEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isSmartOrdersEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isOrderRegretEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.defaultDeliveryBuffer = (Integer) in.readValue(Integer.class.getClassLoader());
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
    }

    public static final Creator<VenueInfo> CREATOR = new Creator<VenueInfo>() {
        @Override
        public VenueInfo createFromParcel(Parcel source) {
            return new VenueInfo(source);
        }

        @Override
        public VenueInfo[] newArray(int size) {
            return new VenueInfo[size];
        }
    };
}
