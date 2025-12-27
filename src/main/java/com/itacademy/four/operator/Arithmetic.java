package com.itacademy.four.operator;

import java.util.Scanner;

/**
 * aritmeticki operatori
 * + addtive
 * - substraction
 * * multiplicier
 * / division
 * % modulo ostatak od dijeljenja
 */
public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("dobrodosli unesite prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesite drugi broj");
        int number2 = new Scanner(System.in).nextInt();

        int suma = number1 + number2;
        System.out.println("suma= " + suma);
    }
}
