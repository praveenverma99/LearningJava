public class Methods {
    public static void main(String[] args) {
        int x= 4;
        int y = 5;
       int z = add(x,y);
        System.out.println(z);
    }
    public static int add (int x, int y){
        int z = x + y ;
        return z;
    }

    public int add (int x, int y , int k){
        int z = x + y  + k;
        return z;
    }



}

