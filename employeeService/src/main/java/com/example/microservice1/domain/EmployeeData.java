package com.example.microservice1.domain;



public class EmployeeData {

    private long id;
    private String name;

    public EmployeeData() {
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

    public EmployeeData(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
