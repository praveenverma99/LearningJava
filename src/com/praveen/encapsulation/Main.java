package com.praveen.encapsulation;

public class Main {

    public  void main(String[] args) {

        Car Hatcback = new Car("Maruti", "Swift", 2002);

        Hatcback.setYear(2022);

        System.out.print(Hatcback.getModel());
        System.out.print(Hatcback.getYear());
        System.out.println(Hatcback.getMake());


    }

}
