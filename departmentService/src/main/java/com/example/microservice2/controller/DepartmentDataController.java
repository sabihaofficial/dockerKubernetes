package com.example.microservice2.controller;

import com.example.microservice2.domain.EmployeeData;
import com.example.microservice2.service.DepartmentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentDataController {
    @Autowired
    DepartmentDataService departmentDataService;


    @GetMapping("/getEmployeeData")
    public List<EmployeeData> getTestData() {

        return departmentDataService.getEmployeeData();
    }

}
