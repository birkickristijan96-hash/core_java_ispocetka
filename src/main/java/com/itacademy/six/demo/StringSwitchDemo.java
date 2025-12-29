package com.itacademy.six.demo;

import java.util.Scanner;

/**
 * korisnik unosi tekstualnu vrijednost dakle tipa string
 * ukoliko je ispravno unio ime dana u sedmici na engleskom dobit ce redni broj dana u sedmici
 *
 * String dayName = "monday"
 * int redniBroj = 1;
 *
 *
 */
public class StringSwitchDemo {
    public static void main(String[] args) {
        System.out.println("upisi ime i dobis redni broj daa u sedmici");
        String dayName = new Scanner(System.in).nextLine();
        int redniBroj;
        switch (dayName){
            case  "monday" :
                redniBroj = 1;
                break;
            case "thuesdy":
                redniBroj= 2;
                break;
            case "wednesday":
                redniBroj =3;
                break;
            case " thursday" :
                redniBroj = 4;
                break;
            case " friday" :
                redniBroj = 5;
                break;
            case " saturday":
                redniBroj = 6;
                break;
            case "sunday" :
                redniBroj =7;
                break;
            default:
                redniBroj = 0 ;
                break;
        }
        String message= " za uneseni dan %s redni broj dana je  %s ".formatted(dayName, redniBroj);
        System.out.println(message);
    }

}
