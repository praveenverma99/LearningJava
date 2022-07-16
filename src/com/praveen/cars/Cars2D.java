package com.praveen.cars;

public class Cars2D {
    public static void main(String[] args) {


        String[][] cars = {{"m", "h", "t" },
                {"h", "b", "i" }};

       //  System.out.println(cars[1][1]);
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print("  " + cars[i][j] + " ");
            }
        }
    }
}