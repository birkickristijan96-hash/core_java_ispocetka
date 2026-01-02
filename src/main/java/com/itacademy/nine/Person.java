package com.itacademy.nine;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(){}

    //overloading po broju parametara

    public Person(String ime, String prezime){
        this.name = ime;
        this.surname = prezime;

    }
// int age je parametar funkcije a this.age je referenca na polje objekta koji se konstruira
    public Person(String ime, String prezime, int age){
        this.name = ime;
        this.surname = prezime;
        this.age= age;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
