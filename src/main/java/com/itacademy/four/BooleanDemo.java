package com.itacademy.four;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("upisi omiljeni broj");
        int omiljeniBroj = new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj == 3; //samo true ili false
        //java je strogo tipizirana
        if (condition) {
            System.out.println("zadovoljio si");
        }else {
            System.out.println("nisi zadovoljio ");
        }
    }
}
