package Basic.constructer;

public class Overload_con {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("vikash Maurya", "Vishal", "Vinnu", " ");
        System.out.println("Hello this is item: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}

class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String first, String second, String third) {
        this.bread = first;
        this.sauce = second;
        this.cheese = third;
    }

    Pizza(String first, String second, String third, String fourth) {
        this.bread = first;
        this.sauce = second;
        this.cheese = third;
        this.topping = fourth;
    }
}