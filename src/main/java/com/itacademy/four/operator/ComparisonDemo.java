package com.itacademy.four.operator;

import java.util.Scanner;

/**
 * operatori poredenja
 *  == equal
 *
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("unesi prvi broj");
       int num1 = new Scanner(System.in).nextInt();
        System.out.println("unesi dr broj");
       int num2 = new Scanner(System.in).nextInt();
        if (num1 == num2) {
            System.out.println("brojevi su jednaki");
        }
        if (num1 != num2){
            System.out.println("brojevi su rayliciti");
        }
    }
}
