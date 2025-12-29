package com.itacademy.six.loop.zadacaa;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int suma=0;
        for (; ; ) {
            System.out.println("unosi broj");
            int uneseniBrojevi = new Scanner(System.in).nextInt();
            if (uneseniBrojevi<0){
                System.out.println();
                break;
            }
            suma+=uneseniBrojevi;
        }
        System.out.println("suma je " + suma);
    }
}
