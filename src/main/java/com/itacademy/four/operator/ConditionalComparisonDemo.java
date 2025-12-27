package com.itacademy.four.operator;

import java.util.Scanner;

/**
 * operator and i or
 * && and
 * || or
 */
public class ConditionalComparisonDemo {
    public static void main(String[] args) {
        System.out.println("unesi prvi broj");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("unesi dr broj");
        int num2 = new Scanner(System.in).nextInt();

        if ((num1 == 22) && (num2 < 10)) {
            System.out.println("zadovoljen i zadovoljencom");
        }
        if ((num1 == 22 )||( num2 > 22)) {
            System.out.println("ili je ovaj ili je onaj");
        }
    }
}
