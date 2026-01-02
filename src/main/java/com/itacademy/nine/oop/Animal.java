package com.itacademy.nine.oop;

/**
 * indikator da po sablonu ove klase ne moete kreirati objekat, instancu
 *
 * cemu sluzi klasa po cijem sablonu ne mozemo kreirati objekat?
 *
 * apstraktne klase -- sluze da nametnu neki sablon ponasanja koje ce naslijediti ovu klasu
 */
public abstract class Animal {

    private String name;

    public Animal (String name){
        this.name = name;

    }

    //funkcija koja nema bloka koda -- apstraktna
    public abstract void playSound();

    public  String getName(){
        return name;
    }
}
