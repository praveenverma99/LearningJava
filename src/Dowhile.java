import java.util.Scanner;

public class Dowhile {
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
