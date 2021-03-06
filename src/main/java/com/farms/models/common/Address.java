/*
 * Developed  by Kiran Yedavalli on 8/17/18 2:35 PM
 * Last Modified 8/9/18 11:39 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.common;
import org.apache.commons.lang3.StringUtils;

public class Address {

    private String doorNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address() {
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Address setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
        return this;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public String idfy(){
        return new StringBuilder()
                .append(StringUtils.lowerCase(doorNumber)).append("-")
                .append(StringUtils.lowerCase(streetName)).append("-")
                .append(StringUtils.lowerCase(city)).append("-")
                .append(StringUtils.lowerCase(state)).append("-")
                .append(StringUtils.lowerCase(zipcode))
                .toString();
    }

    @Override
    public String toString(){
        return new StringBuilder()
                .append(StringUtils.capitalize(doorNumber)).append(" ")
                .append(StringUtils.capitalize(streetName)).append(" ")
                .append(StringUtils.capitalize(city)).append(" ")
                .append(StringUtils.capitalize(state)).append(" ")
                .append(StringUtils.capitalize(zipcode))
                .toString();
    }
}
