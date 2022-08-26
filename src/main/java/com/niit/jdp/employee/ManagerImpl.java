package com.niit.jdp.employee;

import java.time.LocalDate;

public class ManagerImpl {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Aditya",
                23,
                LocalDate.of(1999, 05, 20),
                "Pune",
                1_00_000.0,
                5,
                5);

    }
    }
}
