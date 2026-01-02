package com.itacademy.ten.animal;

/**
 * sustina postojanja apstraktne klase je da se nametne obrazac
 * ponasanjja svim klasama po cijem sablonu ce se kreirati objekti
 *
 *abstract
 * interface
 *
 */
public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void  playSound();


    public String getName() {
        return name;
    }
}
