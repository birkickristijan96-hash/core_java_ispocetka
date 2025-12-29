package com.itacademy.six.loop.zadacaa;

import java.util.Random;
import java.util.Scanner;

public class SevenUpgrade {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            System.out.println("unesi broj");
            int neki = new Scanner(System.in).nextInt();
            int unesni = new Random().nextInt(20);

            if (unesni == neki){
                System.out.println("pogodili ste");
                break;
            }else {
                System.out.println("niste pogodili");
                System.out.println();
            }
        }
    }
}
