package com.sunglosys.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @Autowired
    private Address address;
    public Student(){
        System.out.println("Student boject created successfully");
    }

    public Student(Long id, String firstName, String lastName, String email, Address address) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void newAddress(){
        address.checkAddress();
    }
}
