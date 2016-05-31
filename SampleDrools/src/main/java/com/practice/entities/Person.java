package com.practice.entities;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Years;

import java.util.Calendar;
import java.util.Date;


public class Person {

    private String name;
    private Date dateOfBirth;
    private String gender;
    private String address;
    //private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAgeInYears() {
        DateTime dateTime = new DateTime(dateOfBirth);
        int age = Calendar.getInstance().get(Calendar.YEAR) - dateTime.getYear();
        return age;
    }
}
