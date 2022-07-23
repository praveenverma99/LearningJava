package com.praveen.file;

import java.io.File;

public class Main {
    public static void main(String[] args) {

          File file = new File("message.txt");

          if(file.exists()) {
              System.out.println("File exist!");
              System.out.println(file.getPath());
              System.out.println(file.getAbsolutePath());
              System.out.println(file.isFile());
          }
            else {
              System.out.println("File does not exist here");
        }
    }
}
