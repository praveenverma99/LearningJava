package com.praveen.polymorphism;

public class Main {
    static Car Maruti = new Car();
    static Boat Hero = new Boat();
    static Bicyle Monster = new Bicyle();

    public static void main(String[] args) {

        Vehicle[] Racers = {Maruti, Hero , Monster };
        for (Vehicle x : Racers) {
            x.go();
        }
    }
}