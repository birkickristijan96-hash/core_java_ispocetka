package com.itacademy.ten.human;

import com.itacademy.ten.animal.Animal;
import com.itacademy.ten.animal.Cat;
import com.itacademy.ten.animal.Dog;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * -> :: java.time -- rad sa vrijednostima datuma
 *
 * LocalDate je klasa javina
 *
 * enkapsulacija je moguca zahvaljujuci modifikatoru vidljivosti
 *
 * ne mozemo u enkapsualciji pristupiti direktno
 * enkapsulirano polje
 *
 *
 *  OVO OVDJE JE SAMO DIZAJN MOG VLASTITOG TIPA PODATKA
 *
 *  ovo sve ovdje je sablon po kom je kreiran person1
 *
 *  relacije su nasljedivanje
 *  preslikam stvarni zivot u program
 *
 *
 *  Kompozicija -> Person has a -> person sadrzi String/ LocalDate
 *  kompozicija slozeni objekat
 */

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private Animal animal;


    public Person(String name, String surname, LocalDate birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;

    }


    public Person( LocalDate birthday){
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        //static funkcija
        LocalDate now = LocalDate.now();
        //instancna
        Period period = birthday.until(now);
        int years = period.getYears(); //shorcat sa .var i enter
        return years;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}
