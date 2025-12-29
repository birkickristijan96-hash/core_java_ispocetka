package com.itacademy.six.loop;

import java.util.Scanner;

/**
 * zadatak:
 *      -guess number
 *      program treba da pusti koisnika da unosi broj svee dok ne unese 23
 *      kada unese korisnik 1 0 > unesi broj
 *      unese korisnik 16 -> unesi broj
 *      unese korisnik 23 - > konacno ste unijeli broj
 *
 */
public class WhileDeadLoop {
    public static void main(String[] args) {
    int tajniBroj = 23;
    while (true){
        System.out.println("unesi broj");
        int uneseniBroj =  new Scanner(System.in).nextInt();
        if (uneseniBroj == tajniBroj){
            System.out.println("unijeli ste tajni broj");
            break;
            }else{
            System.out.println("niste pogodili pokusajte ponovo");

            }
        }
    }
}
