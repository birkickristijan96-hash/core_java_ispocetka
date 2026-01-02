package com.itacademy.seven;

import java.util.Scanner;

/**
 * imas niz brojeva : 32 45 67  54  87 56 54 564
 * pusti korisnika da unosi neki broj
 *
 * program izbaci sretan ili nesretan pokusaj
 *  ukoliko se nalazi sretan
 *  ukoliko ne postoji nesretan
 *
 */
public class BreakDemo {
    public static void main(String[] args) {
        int [] array = {32, 45, 67, 54, 87, 56, 54, 564};
            System.out.println("unesi neki broj");
            int uneseni = new Scanner(System.in).nextInt();
            String message = " nesretan";
            for (int i=0; i<array.length; i++){
                int arrayNumber = array[i];
                if (arrayNumber == uneseni){
                    message = " sretan pokusaj broj indeks u nizu je [" + i + "]";
                    break;
                }
            }
            System.out.println(message);
    }
}
