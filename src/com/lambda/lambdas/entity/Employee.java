package com.lambda.lambdas.entity;

public class Employee {

    private String dni;
    private String name;
    private Double salary;

    public Employee() {
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
