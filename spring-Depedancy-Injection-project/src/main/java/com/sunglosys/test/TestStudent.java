package com.sunglosys.test;

import com.sunglosys.config.ApplicationConfigration;
import com.sunglosys.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigration.class);
        Student student = (Student) context.getBean(Student.class);
        System.out.println();
        student.setFirstName("DineshKumar");

        System.out.println("Student Name: " +student.getFirstName());
        System.out.println();
        student.newAddress();

    }
}
