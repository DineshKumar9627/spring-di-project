package com.codingraja.domain;

public class Address {

    private Long addressId;
    private String houseNo;
    private String street;
    private String city;
    private String zipcode;

    public Address() { System.out.println("Address object is created");}

    public Address(long addressId, String houseNo, String street, String city, String zipcode) {
        super();
        this.addressId = addressId;
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void checkAddress() {
        System.out.println("AddressId: " + 1001);
        System.out.println("House No: " + "H-10");
        System.out.println("Street: " + "Near Vishal Mega mart");
        System.out.println("City: " + "Bangalore");
        System.out.println("Zipcode: " + "560068");
    }
}
