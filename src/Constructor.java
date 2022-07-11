public class Constructor {
    public static void main(String[] args) {
        Methods methods =  new Methods();
        Loop loop = new Loop();
        System.out.println("method and loop created");
        Methods.add(2, 3);
        methods.add(3, 4, 5);

    }
}
