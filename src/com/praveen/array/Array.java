package com.praveen.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int row;
        int column;
        String symbol = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of row in array :");
        row = scanner.nextInt();
        System.out.println("Enter no. of column in array :");
        column = scanner.nextInt();
        System.out.println("Enter symbol to used to fill array : ");
        symbol = scanner.next();

        for(int i=1;i<=row;i++){
            System.out.println();
            for(int j=1 ; j<=column ; j++){
                System.out.print(symbol);
            }
        }
    }
}
