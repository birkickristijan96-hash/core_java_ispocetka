package com.itacademy.five.arrray;

public class MultidimensionalArray {
    public static void main(String[] args) {

        String [] names = new String[2];
        names [0] = "kristijan";
        names [ 1] = "birkic";

        String [] surname = {"birkic", "rita"};
        // ukoliko sus svi elementi vanjskog niza ist duzina = matrica
        String [][] array = {
                {"her", "frau"},
                {"kristijan", "rita"}
        };
        System.out.println(array [0][0] + " " + array [1][0]);
        System.out.println(array.length); // 2
        System.out.println(array[0].length); //3
        System.out.println(array[1].length);
    }
}
