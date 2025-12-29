package com.itacademy.six.demo;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("korisnik unosi broj mjeseca");
        int numberMonth = new Scanner(System.in).nextInt();
        System.out.println("unesi i godinu");
        int year = new Scanner(System.in).nextInt();
        int brojDanaUMjesecu = switch (numberMonth){
            case 1,3, 5,7, 8, 10,12 ->31;
            case 4, 6, 9, 11 ->30;
            case 2 -> {
                boolean prestupna = ((year%4 == 0 && year % 100 !=0) || (year%400 == 0));
                yield prestupna ? 29 : 28;
            }
            default -> 0;
        };
        System.out.println("za uneseni mjesec " + numberMonth + " i godinu " + year + " redni broj dana je " + brojDanaUMjesecu);
    }
}
