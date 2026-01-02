package com.itacademy.nine;

/**
 * konstruktori i funkcije koje se isto zovu -- preklapanje
 * preklapanje po tipu parametara
 * preklapanje po broju parametara
 */
public class PersonDemo {
    public static void main(String[] args) {


        //name surname age
        //name surname -- definiram konstruktor sa parametrima
        //konstruktor sluzi da konstruira varijablu
        //dizajnom konstruktora namecemo ono sto se mora ispuniti
        Person  person = new Person("kristijan", "birkic");
        person.setSurname("brkic");

        Person p2 = new Person("krisitjan", "birkic", 29);
        System.out.println("momenat rodenja " + p2.getName() + " " + p2.getSurname() + " " + p2.getAge() );
        p2.setSurname("mirkovic");
        p2.setAge(30);
        System.out.println("momenat rodenja " + p2.getName() + " " + p2.getSurname() + " " + p2.getAge() );

    }
}
