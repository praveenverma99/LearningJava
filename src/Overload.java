public class Overload {
    public static void main(String[] args) {
      int x = add(1,2 , 5 );

        System.out.println(x);
        double doubleSum = add( 1.2 , 1.5);
        System.out.println(doubleSum);

    }

    static int add(int a, int b) {
        System.out.println("first overload method used ");
        return a + b;
    }
    static double add(double a, double b) {
        System.out.println("second overload method used ");
        return a + b;
    }
     static int add (int a, int b , int c ) {
         System.out.println("First overload method used");
         return a+ b+ c;
     }
     static int add (int a , int b , int c , int d) {
         System.out.println("First overload method used");
         return a+ b+ c+ d;

    }
}
