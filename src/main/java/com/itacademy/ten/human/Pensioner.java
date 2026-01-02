package com.itacademy.ten.human;
/**
 * prvo se poziva blok koda super onda ono sto se dodaje
 */

import java.time.LocalDate;

public class Pensioner extends Person{
    private double pensionerSalary;

    public Pensioner(String name, String surname, LocalDate birthday, double pensionerSalary) {
        super(name, surname, birthday);
        this.pensionerSalary = pensionerSalary;
    }

    public double getPensionerSalary() {
        return pensionerSalary;
    }

    public void setPensionerSalary(double pensionerSalary) {
        this.pensionerSalary = pensionerSalary;
    }
}
