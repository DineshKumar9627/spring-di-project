package com.sunglosys.domain;

public class Address {
    private  Long id;
    private String addressLine1;
    private String getAddressLine2;
    private String landmark;
    private String state;
    private String zipcode;

    public Address(){
        System.out.println("Address object created successfully");
    }

    public Address(Long id, String addressLine1, String getAddressLine2, String landmark, String state, String zipcode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        this.landmark = landmark;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public void checkAddress(){
        System.out.println("id: " + 1001);
        System.out.println("AddressLine1: " +"Ambarpur Bhudiya");
        System.out.println("AddressLine2: " + "Bhudiya");
        System.out.println("Landmark: " + "Mohanpura");
        System.out.println("State: " + "UP");
        System.out.println("Zipcode : " + "207401");

    }

}
