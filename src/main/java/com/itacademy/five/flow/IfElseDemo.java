package com.itacademy.five.flow;

import java.util.Scanner;

/**
 * ostavka zadatka
 * potrebno napraviti program koji ce omoguciti olaksano ocjenjivanje
 * definirati ce ostvareni score poena
 * int varijabla
 * profesor ce dati programu input broj ostvarenih poena
 *
 * program mora izracunati ocjenu (grade)
 */
public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("unesite broj ostvarenih poena");
        int score = new Scanner(System.in).nextByte();
        char grade; // varijabla koja ce definirati ocjenu na osnovu score
        if (score > 90) {
            grade = '5';
        }
    else if(score <=90) {
            grade = '4';
        }else {
        grade = '0';
                }
        System.out.println("ocjena je " + grade);
        }
    }

    //vazan je redoslijed jer onaj koji je prosao true iskljucuje provjeru drugih
