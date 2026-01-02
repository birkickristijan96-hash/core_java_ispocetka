package com.itacademy.eight;

public class Movie {


    private static int ncounter = 0;

    private String title;   /// mogu biti staticka ili instancna polja
    private String director;
    private int evaluation;

    //parametar fukcije
    public void ocijeni(int ocjena) {
        if (ocjena <= 0) {
            this.evaluation = 1;
        } else if (ocjena > 10) {
            this.evaluation = 10;
        } else {
            this.evaluation = ocjena;
        }
    }
    public int dohvati(){
        return this.evaluation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }
}
