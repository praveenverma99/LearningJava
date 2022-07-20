package com.praveen.array;

public class Twoarray {

        public static void main(String[] args) {

                int a;
                int b;
                int k = 0;
                int twoD[][] = new int[4][5];

                for (a = 0; a < 4; a++)
                        for (b = 0; b < 5; b++) {
                                twoD[a][b] = k;
                                k++;
                                // System.out.print(k);
                        }
                for (a = 0; a < 4; a++) {
                        for (b = 0; b < 5; b++)
                                System.out.print(twoD[a][b] + " ");
                        System.out.println();
                }
        }
}