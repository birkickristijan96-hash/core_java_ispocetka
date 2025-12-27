package com.itacademy.five.flow;

import java.util.Scanner;

/**
 * kontrola toka
 * prva osnovna kontrola toka
 *
 * if else
 * if then else
 * witch
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("unesi neki brj i provjeri jesi li dobar");
        int number = new Scanner(System.in).nextInt();
     boolean condition = number <=23;
     //if  pa izraz cija krajnja vrijednost mora biti true ili false -- boolean tipa
     if (condition){
         System.out.println("sretan si");
     }else {
         System.out.println("niste bas sretni");
     }

    }
}
