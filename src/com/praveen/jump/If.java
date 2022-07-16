package com.praveen.jump;

public class If {
    public static void main(String[] args) {
        int age = 26 ;
        if(age<=18) {
            System.out.println("Not eligible to vote");
        }
        else if (age<=20) {

            System.out.println("First time voter");
        }
        else if (age==26) {
            System.out.println("Eligible to Be MP");

        } else {
             System.out.println("Eligible to vote");
        }
    }
}
