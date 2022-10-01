package com.example.microservice2.domain;

public class DepartmentData {

    private long id;
    private String name;

    public EmployeeData getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    private EmployeeData employeeData;

    public DepartmentData() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public DepartmentData(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
