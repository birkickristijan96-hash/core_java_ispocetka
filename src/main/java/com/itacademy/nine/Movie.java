package com.itacademy.nine;

/**
 * klasa se koristi kao tip podatka po cijem sablon mozemo kreirati varijable slozenog tipa movie
 *
 * ovdje dizajniramo a drugdje koristio
 *
 * ako je private onda je vidljivo samo u tijelu klase
 *
 * KLASA JE SABLON SABLON SABLON
 *
 * klasa moze imati
 *      1.polja/ fields/ properties
 *          -- instancna ili pripadaju objektu --- ne mozete kreirati polja ako nema movie --iskljucivo za postojanje objekta
 *          --static fields -- ima svoj neki naziv izvrsava se tako sto vrati vrijedost unutar statickog polja- globalno
 *
 *      2.metode ili funkcije
 *              --pripadati objektu tj pozivati se nad objektom recimo movie.setevaluation;
 *              --static metode ->MAIN --za njihov poziv nije uvjet postojanje objekta
 *              --
 *
 *      3.konstruktor -- konstruira objekat --iskljucivo vezan za objekat//samo vezan za
 *      objekat ili varijaablu koju konstruira u memoriji
 *
 */
public class Movie {


    private static int counter = 0;

    private   String name;
    private   String director;
    private int evaluation;
    //funkcija ili metoda je blo koda koji se izvrsava kad ga pozovemo
    //koji je preduvjet  da se ova funkcija pozove
    //postojanje objekta varijabla instanca
    //uvjet da  postoje polja -- jest da postoji objekat
    ////ovo je koncept enkapsulacije, skrivenog pristupa, mozes uciniti preko seter funkcije
    public void setEvaluation (int parametar){
        if(parametar <= 0){
            this.evaluation = 1;
        } else if(parametar >= 10) {
            this.evaluation = 10;
        }
        else{
            this.evaluation = 10;
        }
    }

    /**
     *
     * geteri i seteri enkapsuliranje -- kontrolirana injekcija, brizganje podataka
     * enkapsulacije je pattern private
     * koji je preduvjet da pozovete ovu funkciju
     * sva polja da budu private -- preporuka te da im se pristupa preko getera i setera
     *funkcije u tijelu klase
     * @return evaluation
     */
    public int getEvaluation(){
        return evaluation;  //sustina je da vrati neku vrijednost
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static int getCounter() {
        return counter;
    }
}
