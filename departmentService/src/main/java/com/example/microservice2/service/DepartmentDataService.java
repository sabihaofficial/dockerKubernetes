package com.example.microservice2.service;

import com.example.microservice2.domain.Department;
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


    public Department getHRDepartmentData() {

        String baseUrl = "http://localhost:8080/getemployees";
        EmployeeData[] employees = restTemplate.exchange(baseUrl, HttpMethod.GET, null, EmployeeData[].class).getBody();
        List<EmployeeData> hrEmployees = Arrays.asList(employees).stream().filter(p -> p.getId() < 10).toList();
        Department departmentData = new Department();
        departmentData.setEmployees(hrEmployees);
        departmentData.setId(01);
        departmentData.setDepartment("HR");
        return departmentData;

    }

}
