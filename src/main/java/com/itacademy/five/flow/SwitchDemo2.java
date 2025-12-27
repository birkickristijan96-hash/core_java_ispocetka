package com.itacademy.five.flow;

import java.util.Scanner;

/**
 * samo druga sintaksa sa yield --donesi ili daj ili proizvedi rezultat
 * i imate samo switch case
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("unesi redni broj");
        int weekDay = new Scanner(System.in).nextByte();
        //ulazi weekDay zato sto je integer
        String dayName = switch (weekDay){
            case 1 -> "monday";
            case 2 -> "thuesday";
                default -> "sedmica ima 7 dana";
        };
//        switch (weekDay) {
//            case 1:
//                dayName = " monday";
//                break;
//            case 2:
//                dayName = "thuesday";
//                break;
//            default:
//                dayName = "sedmica ima 7 dana";
//        }
        System.out.println(dayName);
    }
}
