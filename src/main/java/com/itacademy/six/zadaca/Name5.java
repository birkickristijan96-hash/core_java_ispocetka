package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Name5 {
    public static void main(String[] args) {
        System.out.println("unesi ime dana na hrvatskom");
        String dayName = new Scanner(System.in).nextLine();
        String typeOfDay;
        switch (dayName){
            case "ponediljak":
            case "utorak":
            case "srijeda":
            case "cetvrtak":
            case "petak":
                typeOfDay= "radni dan";
                break;
            case "subota":
            case "nedilja":
                typeOfDay= "vikend";
                break;
            default:
                typeOfDay =" sedmica ima sedam dana";
                break;
        };
        System.out.println(typeOfDay);
    }
}
