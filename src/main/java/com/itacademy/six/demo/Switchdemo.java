package com.itacademy.six.demo;

import java.util.Scanner;

/**
 * switch sa spojenim breakovima
 *
 * korisnik unosi redni broj mjeseca u godini
 * korisnik unosi godinu
 *
 * program izracuna koliko mjesec ima dana
 *
 */
public class Switchdemo {
    public static void main(String[] args) {
        System.out.println("korisnik unosi broj mjeseca");
        int numberMonth = new Scanner(System.in).nextInt();
        System.out.println("unesi i godinu");
        int year = new Scanner(System.in).nextInt();
        int brojDanaUMjesecu;
        switch (numberMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaUMjesecu = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaUMjesecu = 30;
                break;

            case 2:
                if ((year%4 == 0 && year % 100 !=0) || (year%400 == 0)) {
                brojDanaUMjesecu = 29;
            }else {
                    brojDanaUMjesecu = 28;
                }
                break;
            default:
                brojDanaUMjesecu = 0;
        }
        System.out.println("za uneseni mjesec " + numberMonth + " i godinu " + year + " redni broj dana je " + brojDanaUMjesecu);
    }
}
