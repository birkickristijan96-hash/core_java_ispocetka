package com.itacademy.six.loop;

import java.util.Scanner;

public class DeadForLoop {
    public static void main(String[] args) {
        int tajniBroj = 23;
        for (;;){
            System.out.println("unesi broj");
            int uneseni =  new Scanner(System.in).nextInt();
            int razlika= uneseni - tajniBroj;
            if (razlika == 0){
                System.out.println("pogodili ste");
                break;
            } else if (razlika > 10) {
                System.out.println("blizu ste al niste pogodili");
            } else if (razlika<5) {
                System.out.println("jako ste blizu");
            } else {
                System.out.println("niste pogodilipokusajte opet...");
            }
        }
    }
}
