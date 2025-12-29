package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Name1 {
    public static void main(String[] args) {
        System.out.println("unesi broj mjeseca");
        int monthNumber =  new Scanner(System.in).nextInt();
        String monthName = switch (monthNumber) {
            case 1 -> "januar";
            case 2 -> "februrar";
            case 3 -> "march";
            default -> "broj mjeseca ima samo do 12";
        };
        String message = " za uneseni broj mjeseca %s  mjesec se zove %s ".formatted(monthNumber, monthName);
        System.out.println(message);
    }
}
