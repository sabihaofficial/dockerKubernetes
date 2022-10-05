package com.example.microservice2.domain;

import java.util.List;

public class Department {

    private long id;
    private String department;
    private List<EmployeeData> employees;

    public void setDepartment(String department) {
        this.department = department;
    }




    public List<EmployeeData> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeData> employees) {
        this.employees = employees;
    }



    public Department() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public Department(long id, String department) {
        this.id = id;
        this.department = department;
    }
}
