package com.sunglowsys.test;
import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.scan("com.sunglowsys.domain");
            context.refresh();
        Student student = context.getBean(Student.class);
        student.setMsg("hello java");
        System.out.println(student.getMsg());

        Student student1 = context.getBean(Student.class);
        student1.setMsg("Spring programm");
        System.out.println(student1.getMsg());

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
