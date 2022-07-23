package com.praveen.polymorphism;

public class Main {

    static Car Maruti = new Car();
    static Boat Hero = new Boat();

    Vehicle[] Racers = {Maruti, Hero};

    public static void main(String[] args) {

        Vehicle[] Racers = {Maruti, Hero};
        for (Vehicle x : Racers) {
            x.go();
        }
    }
}