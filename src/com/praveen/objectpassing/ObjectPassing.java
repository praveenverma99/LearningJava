package com.praveen.objectpassing;

public class ObjectPassing {

    public static void main(String[] args) {

          Garage garage = new Garage();
          Cars cars2 = new Cars("Maruti");
        Cars cars1 = new Cars("TATA");

          garage.park(cars2);
        garage.park(cars1);
    }
}
