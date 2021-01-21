package co.in.practice.simple.models;

import com.google.gson.Gson;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@Document
public class AreaDetails {

    @Indexed(name = "AreaUnqIndex", unique = true, sparse = true)
    private String areaName;
    @Indexed(name = "cityUnqIndex", unique = true, sparse = true)
    private String city;
    @Indexed(name = "pinCodeUnqIndex", unique = true, sparse = true)
    private String pinCode;
    private int locationCode;
    private String regionCode;


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(int locationCode) {
        this.locationCode = locationCode;
    }

    public String toJsonHashValue() {
        Map<String, Object> dataAsMap = new LinkedHashMap<>();
        Gson gson = new Gson();
        String jsonData = gson.toJson(this);
        dataAsMap = gson.fromJson(jsonData, Map.class);
        TreeMap<String, Object> tempTreeMap = new TreeMap<>();
        tempTreeMap.putAll(dataAsMap);

        return String.valueOf(tempTreeMap.hashCode());
    }
}
