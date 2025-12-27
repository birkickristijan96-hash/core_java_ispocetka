package com.itacademy.five.arrray;

/**
 * kako da kopiramo elemente iz jednog niza u drugi
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {

        char [] copy = {'a', 'w', 'c', 't', 'e' };

        char [] copyTo = new char[4];
        System.arraycopy(copy,2, copyTo, 0, 3 );


    }
}
