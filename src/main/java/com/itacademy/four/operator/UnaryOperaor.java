package com.itacademy.four.operator;

/**
 * unarni plus operator +  -- inicira da se radi o pozitivnom broju
 * -- unarni minus operator
 * ++ Inkrement
 * pre inkrement
 * post inkrement
 *
 * --dekrement
 * pre i post
 *
 * invertor / komplement
 */
public class UnaryOperaor {
    public static void main(String[] args) {
        int number = 22;
        System.out.println(number++); //1. posalji u konzolu a onda nakon slanja u konzolu uvecaj za jedan
        System.out.println(++number);//uvecaj za jedan = 24, posalji u konzolu 24

        int broj1 = 24;
        System.out.println(broj1--);//24
        System.out.println(--broj1);//22

        boolean success = true;
        System.out.println(!success);
    }
}
