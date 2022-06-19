package Basic.Array;

public class p1 {
    public static void main(String[] args) {
        // String[] names = {"Vikash", "Vishal", "Vinnu", "123"};
        // names[0] = "Maurya";// It's has high prority
        String[] names = new String[4]; // or String names[] = new string[]
        names[0] = "vikash";
        names[1] = "Maurya";
        names[2] = "Vishal";
        names[3] = "Mauray";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
