package Basic.mathod;

public class p1 {
    public static void main(String[] args) {
        String name = "Vikash";
        hello();
        hello(name);
        int x = 10;
        int y = 25;
        // int z = add(x, y);
        System.out.println(add(x, y));

    }

    static void hello() {
        System.out.println("Hello");
    }

    static void hello(String Name) {
        System.out.println("Hello " + Name);
    }

    static int add(int X, int Y) {
        // int Z = X + Y;
        return X + Y;
    }
}
