package com.example.microservice2.service;

import com.example.microservice2.domain.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DepartmentDataService {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;


    public List<EmployeeData> getEmployeeData() {

        String baseUrl = "http://localhost:8080/getEmployees";
        EmployeeData[] employees = restTemplate.exchange(baseUrl, HttpMethod.GET, null, EmployeeData[].class).getBody();
        List<EmployeeData> response = Arrays.asList(employees);
        return response;

    }

}
