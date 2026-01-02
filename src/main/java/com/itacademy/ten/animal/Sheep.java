package com.itacademy.ten.animal;

/**
 * lose je dirati postojeci kod
 * postojece funkcionalnosti
 *
 */

public class Sheep extends Animal{

    public Sheep(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("meeee");
    }
}
