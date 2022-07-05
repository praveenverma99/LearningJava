 import javax.swing.*;
 import java.util.Scanner;
 import javax.swing.*;
 import javax.swing.JOptionPane;
 import java.util.function.IntFunction;

 public class Main {
    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog(null, "hello " +name);

       int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
       JOptionPane.showMessageDialog(null, "Age " + age);

       double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "height " + height);

    }
}

