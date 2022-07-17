package com.praveen.inheritance;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Car Maruti = new Car();
          Maruti.go();
        Bicylc Hero = new Bicylc();
           Hero.stop();

        System.out.println(Maruti.Doors);
        System.out.println(Hero.Pedal);

    }
}
