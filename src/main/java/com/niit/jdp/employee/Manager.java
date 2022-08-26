package com.niit.jdp.employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;
    private int ratingByTeam;

    public Manager(String name, int age, LocalDate dateOfBirth, String address, double salary, int teamSize, int ratingByTeam) {
        super(name, age, dateOfBirth, address, salary);
        this.teamSize = teamSize;
        this.ratingByTeam = ratingByTeam;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public int getRatingByTeam() {
        return ratingByTeam;
    }
}
