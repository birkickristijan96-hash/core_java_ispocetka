package com.itacademy.four.operator;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("kolko je dva plus dva");
        int result = new Scanner(System.in).nextInt();
        boolean uslov = result == 4;
        String message = uslov ? "tocno " : "netocno";
//        if (uslov) {
//        message = "tocno";
//        }else {
//            message = "netocno";
//        }
        System.out.println(message);
    }
}
