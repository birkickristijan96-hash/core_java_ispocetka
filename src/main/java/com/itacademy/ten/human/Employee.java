package com.itacademy.ten.human;

import java.time.LocalDate;

public class Employee extends Person {
private double salary;

    public Employee(String name, String surname, LocalDate birthday, double salary) {
        super(name, surname, birthday);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
