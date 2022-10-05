package com.example.microservice2.controller;

import com.example.microservice2.domain.Department;
import com.example.microservice2.service.DepartmentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentDataController {
    @Autowired
    DepartmentDataService departmentDataService;


    @GetMapping("/get/department/hr")
    public Department getTestData() {
        Department departmentData = departmentDataService.getHRDepartmentData();

        return departmentData;
    }

}
