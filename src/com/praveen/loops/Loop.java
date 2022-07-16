package com.praveen.loops;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

         for(int i=0; i<=10; i++){
           System.out.println(i);

                  }
           System.out.println("End");
        }

    public static class Dowhile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter Your name");
             String name="a" ;

             do {
                 System.out.println("Enter your name: ");
                 name = scanner.nextLine();
             }
            while (name.isBlank()) ;
                System.out.println("Hello " + name);

        }
    }
}

