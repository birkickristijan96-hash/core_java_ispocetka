package com.itacademy.ten.animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("aw aw aw");
    }
}
