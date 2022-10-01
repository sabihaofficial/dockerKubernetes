package com.example.microservice1.controller;

import com.example.microservice1.domain.EmployeeData;
import com.example.microservice1.service.EmployeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDataService employeeDataService;

//    @GetMapping("/gettestdata/{id}")
//    public TestData getTestDataById(@PathVariable("id") Long id) {
//        return testDataService.getTestDataById(id);
//    }

    @GetMapping("/getEmployees")
    public List<EmployeeData> getTestData() {
        return employeeDataService.getAllTestData();
    }
//
//    @PutMapping("/adddata/{id}/{name}")
//    public void addData(@PathVariable("id") Long id, @PathVariable("name") String name) {
//        testDataService.putTestData(id, name);
//    }
}
