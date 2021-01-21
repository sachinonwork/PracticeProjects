package co.in.practice.simple.models;

import com.google.gson.Gson;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="SalesContacts")
public class SalesContact {

    @Id
    private String id;
    private String name;

    private AreaDetails areaResponsible;
    private String contactInfo;
    private String designation;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AreaDetails getAreaResponsible() {
        return areaResponsible;
    }

    public void setAreaResponsible(AreaDetails areaResponsible) {
        this.areaResponsible = areaResponsible;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String jsonString() {

        Gson gson = new Gson();
        return gson.toJson(this).toString();
    }
}
