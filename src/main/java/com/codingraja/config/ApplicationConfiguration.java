package com.codingraja.config;

import com.codingraja.domain.Address;
import com.codingraja.domain.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Employee getEmployee() {
        return new Employee();
    }

    @Bean
    public Address getAddress() {
        return new Address();
    }
}
