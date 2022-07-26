package com.praveen.filewriter;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {


        try {
            FileWriter jk = new FileWriter("message.txt");
            jk.write("Roses are red \n Oranges are Orange");
            jk.append("\n(message)");
               jk.close();

        }
        catch (IOException e) {
        //    throw new RuntimeException(e);.
            e.printStackTrace();
        }
    }
}