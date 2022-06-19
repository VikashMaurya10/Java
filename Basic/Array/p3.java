package Basic.Array;

public class p3 {
    public static void main(String[] args) {
        // Food[] shop = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Bread");
        Food food3 = new Food("vegatable");

        Food[] shop = { food1, food2, food3 };

        // shop[0] = food1;
        // shop[1] = food2;
        // shop[2] = food3;
        // System.out.println(shop[0].name);

        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i].name);
        }
    }
}

class Food {
    String name;

    Food(String Name) {
        this.name = Name;
    }
}
