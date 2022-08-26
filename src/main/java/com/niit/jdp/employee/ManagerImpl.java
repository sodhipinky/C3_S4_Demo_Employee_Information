package com.niit.jdp.employee;

import java.time.LocalDate;

public class ManagerImpl {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Aditya",
                23,
                LocalDate.of(1999, 5, 20),
                "Pune",
                1_00_000.0,
                5,
                5);
        System.out.println("Name = " + manager.getName());
        System.out.println("Age = " + manager.getAge());
        System.out.println("Date Of Birth = " + manager.getDateOfBirth());
        System.out.println("Address = " + manager.getAddress());
        System.out.println("Salary = " + manager.getSalary());
        System.out.println("Team Size = " + manager.getTeamSize());
        System.out.println("Rating By Team = " + manager.getRatingByTeam());
    }
}
