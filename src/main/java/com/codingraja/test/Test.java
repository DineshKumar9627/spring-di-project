package com.codingraja.test;

import com.codingraja.config.ApplicationConfiguration;
import com.codingraja.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Employee employee = (Employee) context.getBean(Employee.class);
        System.out.println();
        employee.setEmpName("Raja Rajput");

        System.out.println("Employee Name: "+employee.getEmpName());
        System.out.println();
        employee.newAddress();
    }
}
