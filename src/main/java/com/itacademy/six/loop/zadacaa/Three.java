package com.itacademy.six.loop.zadacaa;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("unosi broj");
        int numberU= new  Scanner(System.in).nextInt();
        do {
            System.out.println(numberU);
            numberU--;
        }while (numberU==0); // ne moze ici uslov ==0 jer onda daje samo broj jednak 0
        //petlje vecinom koriste raspon pa idu >= <= > <
    }
}
