package com.itacademy.five.arrray;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {
       char [] copy = {'a', 'w', 'c', 't', 'e' };
       char [] copyTo = Arrays.copyOfRange(copy, 0, 3);
        System.out.println(copyTo);
    }
}
