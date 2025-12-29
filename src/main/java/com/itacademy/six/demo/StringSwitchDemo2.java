package com.itacademy.six.demo;

import java.util.Scanner;

public class StringSwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("unesi ime dana na engleskom");
        String imeDana = new Scanner(System.in).nextLine();
        int brojDana = switch (imeDana){
            case "monday" -> 1;
            case "tuesday" -> 2;
            case "wednesday" -> 3;
            default -> 0;
        };
        String message = "ime dana uneseno na engleskom '%s' je redni broj '%s'".formatted(imeDana, brojDana);
        System.out.println(message);
    }
}
