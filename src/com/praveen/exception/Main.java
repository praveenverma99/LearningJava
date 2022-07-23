package com.praveen.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try  {
            int x, y, z;
            System.out.print("Enter no. to be divided :");

            x = scanner.nextInt();
            System.out.print("Enter no. which divides :");
            y = scanner.nextInt();

            y = x / y;
            System.out.println("Result :" + y);
        }
            catch(ArithmeticException e) {
            System.out.println("Y cannot be zero");
        }
            catch(InputMismatchException e) {
            System.out.println("Plz enter no. only");
        }
            catch(Exception e) {
            System.out.println("Don't act smart");
        }
            finally {
            System.out.println("This will always Print");
        }
    }
}


