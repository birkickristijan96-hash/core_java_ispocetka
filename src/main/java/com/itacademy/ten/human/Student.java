package com.itacademy.ten.human;

import java.time.LocalDate;

/**
 * inheritance - extends nasljedivanje
 */
public class Student extends Person {

    private String index;

    public Student(String name, String surname, LocalDate birthday, String index) {
        super(name, surname, birthday);
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
