package com.itacademy.six.loop.zadacaa;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int number;
        for (;;){
            System.out.println("unesi neki broj");
            int uneseni = new Scanner(System.in).nextInt();
            if (uneseni >= 0){
                System.out.println("unijeli ste pozitivan broj zadovoljili ste");
                break;
            }else {
                System.out.println("niste zadovoljili unesite opet ");
                System.out.println();
            }
        }
    }
}
