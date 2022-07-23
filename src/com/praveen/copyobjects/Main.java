package com.praveen.copyobjects;


public class Main {
    public static void main(String[] args) {

        Car Hatcback = new Car("Maruti", "Swift", 2002);

        Hatcback.setYear(2022);

        System.out.println(Hatcback.getModel());
        System.out.println(Hatcback.getYear());
        System.out.println(Hatcback.getMake());


    }
}
