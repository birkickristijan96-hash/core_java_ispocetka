package com.itacademy.nine;

/**
 * jedna klasa mnostvo objekata
 *
 *
 * oop principles;
 *  -- enkapsulacija
 *          modifikatori -- private package private ... public, ..protected
 *
 */
public class Demo {
    public static void main(String[] args) {

        int brojac = Movie.getCounter();
        System.out.println(brojac);

        ConstructorDemo constructorDemo = new ConstructorDemo();

        //cijela poenta price je da kreiram varijable i dizajniram tip podatka pomocu  klase
        Movie movie = new Movie();
        movie.setDirector("director");
        movie.setName("name");
        movie.setEvaluation(-1);
        System.out.println(movie.getName() + " " + movie.getEvaluation());

        //moras inektovati dva polja
        Person  person = new Person("kristijan", "birkic");
        person.setSurname("brkic");
    }
}
