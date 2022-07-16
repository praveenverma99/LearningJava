package com.praveen.array;

public class CarsArray {
    public static void main(String[] args) {

        String[] cars = new String[4] ;
           cars[0] = "Maruti";
           cars[1] = "Tata";
           cars[2] = "Hyundai";
           cars[3] = "Honda";
        System.out.println(cars[1]);

        for( int i=0; i< cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
