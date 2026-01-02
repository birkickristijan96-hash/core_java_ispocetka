package com.itacademy.eight;

import javax.xml.namespace.QName;

/**
 * modifikatori vidljivosti
 * public - svima dostupno
 * paketni
 * protected
 * private
 *
 *
 * klasa sluzi kao neki template za kreiranje vlastitiog tipa podatka
 *
 * klasa moze imati
 *  polja
 */
public class Demo {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "kiko";
        person.surname = "birkic";


    }
}
