package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Name4 {
    public static void main(String[] args) {
        System.out.println("unesi ime drzave");
        String nameCountry = new Scanner(System.in).nextLine();
        String capital =" ";
        switch (nameCountry){
            case "francuska":
                capital = "paris";
                break;
            case "hrvatska":
                capital = "zagreb";
                break;
            case "amerika":
                capital = "sad";
                break;
            default:
                capital = " unknown capital";
        };
        System.out.println(capital);
    }
}
