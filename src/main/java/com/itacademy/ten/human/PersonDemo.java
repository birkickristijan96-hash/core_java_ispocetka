package com.itacademy.ten.human;

import java.time.LocalDate;

/**
 * this.name se bukvalno referencira na person1
 *
 * staticke i nestaticke
 * staticke se mogu pozvati i kad ne postoji objekat
 *
 *
 */
public class PersonDemo {
    public static void main(String[] args) {
        //static
        LocalDate birthdayR = LocalDate.of(1996, 11, 22);

        Person person1 = new Person(birthdayR);

        //setName -- instancna za ciji poziv je preduvjet postojanje objekta, objektna, nestaticna
        person1.setName("kristijan"); //vrlo vazno -- ne ubaci u polje klase nego u polje objekta

        System.out.println(LocalDate.now());
        System.out.println( person1.getName() + " " + person1.getAge() + " ima godina");


    }
}
