package com.itacademy.six.demo;

import java.util.Scanner;

/**
 *
 */
public class SixDemo {
    public static void main(String[] args) {
        System.out.println("unesi redni broj dana u sedmici");
        int dayWeekNumber = new Scanner(System.in).nextInt();
        String preostaliDani = "";
        switch (dayWeekNumber){
            case 1:
                    preostaliDani = preostaliDani + " monday";
            case 2:
                    preostaliDani = preostaliDani + " thuesday";
            case 3:
                    preostaliDani = preostaliDani + " wedbesday";
            case 4:
                    preostaliDani = preostaliDani + " thursday";
            case 5:
                    preostaliDani = preostaliDani + " friday";
            case 6:
                    preostaliDani = preostaliDani + " aturday";
            case 7:
                    preostaliDani = preostaliDani + " sunday";
                    break;
            default:
                System.out.println("sedmica ima 7 dana");
        }
        System.out.println(preostaliDani);
    }
}
