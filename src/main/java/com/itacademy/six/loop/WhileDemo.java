package com.itacademy.six.loop;

import java.util.Scanner;

/**
 * while - > sve dok je uslov ispunjen
 *
 *
 * PETLJA 0 > blok koda koji se ponavlja se dok je zadovoljen uslov petlje
 * while(expression koji vrati true ili false)
 * //blok koda petlje
 *
 * -- korak petlje
 *
 * petlja ima tri termina
 *  1. uslov petlje
 *  2. blok koda petlje
 *  3. korak petlje
 */
public class WhileDemo {
    public static void main(String[] args) {
            int number = 11;
            while (number > 0){
                System.out.println(number);
                number--;
            }
        System.out.println("itd");
    }
}
