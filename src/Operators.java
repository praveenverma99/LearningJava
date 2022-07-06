import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("You are playing a game ! Press q or Quit ");
        String response = scanner.next();

        if(response.equals("q") && response.equals("Q")) {
            System.out.println("Both condition fulfilled");
        }
        else if (response.equals("q") || response.equals("Q")) {
            System.out.println("Either condition is fulfilled");
        }
        else {
            System.out.println("No condition is fulfilled");
        {
        }

        }
    }
}
