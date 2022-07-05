import java.util.Scanner;

public class Hypotunse {
    public static void main(String[] args) {
        double perpendicular;
        double base;
        double hypotunse;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter perpendicular of triangle");
        perpendicular = scanner.nextDouble();

        System.out.println("Enter Base of triangle");
        base = scanner.nextDouble();

        hypotunse = calculateHypotunse( perpendicular , base );
        System.out.println(hypotunse);
    }
    public static double calculateHypotunse(double perpendicular , double base) {
        return Math.sqrt((perpendicular*perpendicular) + (base*base)) ;
    }

}
