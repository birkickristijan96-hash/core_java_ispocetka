package com.itacademy.five.arrray;

/**
 * slozeni ili objektni tipovi podataka
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23; // mozemo slozit samo jednu vrijedost u ovu varijablu
        // varijabla koja moze upamtiti 23 i 26 vrijednost a da ne iygubi proslu trebam niz

        /**
         * dva nacina kreiranja nizova
         *
         *
         */
        // zauzimam prostor od 2 puta 32 bita
        int [] numbers = new int[2]; // dva slota za dva broja, memorije
        numbers[0] = 23;
        numbers[1] = 26;
        System.out.println("broj na poziciji nula je" + numbers[0]); // ovako se pristupa vec zapisanim vrijendostima

        /**
         * drugi nacin koji se koristi samo kada su vam unarijed poznati svi brojevi
         *
samo od 1 koraka
         */
        //3 puta po 32 bita  0 -- 23, 1 -- 35 2--23, indeks
        int [] numbers2 = {23, 35, 23};

    }
}
