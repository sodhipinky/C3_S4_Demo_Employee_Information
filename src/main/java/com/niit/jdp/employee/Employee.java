package com.niit.jdp.employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private String address;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, LocalDate dateOfBirth, String address, double salary) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
}
