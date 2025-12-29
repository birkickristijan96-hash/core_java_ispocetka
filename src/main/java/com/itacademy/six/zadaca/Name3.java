package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Name3 {
    public static void main(String[] args) {
        System.out.println("unosi matematicki operator");
        char operator = new Scanner(System.in).next().charAt(0);
        System.out.println("korisnik unosi prvi broj");
        int numberOne  = new Scanner(System.in).nextInt();
        System.out.println("korisnik unosi drugi broj");
        int number2 = new Scanner(System.in).nextInt();
        switch (operator){
            case '+':
                System.out.println("result is " + (numberOne + number2));
                break;
            case '-':
                System.out.println("result is " + (numberOne - number2));
                break;
            case '*':
                System.out.println("result is " + (numberOne*number2));
                break;
            case '/':
                System.out.println("result is " + (numberOne/number2));
                break;
            default:
                System.out.println("ne postoji taj operaor, molimo unesite samo matematicke operatore + - * /");
                break;
        }
    }
}
