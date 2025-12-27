package com.itacademy.five.flow;

import java.util.Scanner;

/**
 * switch -- case -- break
 *
 * ulazi ili int ili nesto sto je konvertibilno
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("unesi redni broj");
        int weekDay = new Scanner(System.in).nextByte();
        //ulazi weekDay zato sto je integer
        String dayName;
        switch (weekDay) {
            case 1:
                dayName = " monday";
                break;
            case 2:
                dayName = "thuesday";
                break;
            default:
                dayName = "sedmica ima 7 dana";
        }
        System.out.println(dayName);
    }
}
