package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Name2 {
    public static void main(String[] args) {
        System.out.println("unesi jedno od slova D H C P i dobit ces zivotinju");
        char slovo = new Scanner(System.in).next().charAt(0);
        switch (slovo){
            case 'd':
                System.out.println("dog");
                break;
            case 'c':
                System.out.println("cat");
                break;
            case 'h':
                System.out.println("horse");
                break;
            case 'p':
                System.out.println("parrot");
                break;
            default:
                System.out.println("unknown animal");
                break;
        }
    }
}
