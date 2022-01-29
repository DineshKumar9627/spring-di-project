package com.codingraja.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private long empId;
    private String empName;
    private String dept;

    @Autowired
    private Address address;

    public Employee() { System.out.println("Employee object is created");}
    public Employee(long empId, String empName, String dept, Address address) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.address = address;
    }
    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void newAddress() {
        address.checkAddress();
    }
}
