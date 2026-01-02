package com.itacademy.ten.animal;

import java.util.concurrent.Callable;

/**
 * polimrfizam -- je direktna posljedica nasljedivanja
 *  -- viseoblicnost -- mnozina oblika
 *
 */


public class AnimalDemo {
    public static void main(String[] args) {


        Animal animal = new Dog("rkk");
        animal.playSound();


        //TIP varijabla = podaci u varijabli
        //dog je tipa Dog ali i Animal
        //instancirati nest ali ne apstraciju
        Animal dog = new Dog("lesi");
        dog.playSound();// aw aw
        //istoimena metoda razlicit blok koda
        //polimorfizam
        dog = new Cat("ciciko");
        dog.playSound();// mjau mjau



    }
}
