package com.sunglosys.config;

import com.sunglosys.domain.Address;
import com.sunglosys.domain.Student;
import org.springframework.context.annotation.Bean;

public class ApplicationConfigration {
    @Bean
    public Student getStudent(){
        return new Student();
    }
    @Bean
    public Address getAddress(){
        return new Address();
    }
}
