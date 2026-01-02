package com.itacademy.eight;

/**
 *
 *  modifikatori vidljivosti
 *  * public - svima dostupno
 *  * paketni
 *  * protected
 *  * private
 *  *
 *  *
 *  * klasa sluzi kao neki template za kreiranje vlastitiog tipa podatka
 *  *
 *  * klasa moze imati
 *  *   polja -- sve modifikatore vidljivosti
 *      konstruktor -- sve modifikatore
 *      funkcije ili metode -- sve modifikatore
 *      inner klase - klase unutar postojece klase
 *
 * outer klasa -- klasa koja  se izto zove kao i fajl .java
 * moze imati samo 2 modifikatora vidljivosti
 *  public, paketno privatni --bez kljucne rijeci
 */
public class Person {
   public String name;
   public String surname;
}
