package Basic.Array;

import java.util.ArrayList;

// This is two dimentional ArrayList.
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> Some_Things = new ArrayList<ArrayList<String>>();

        ArrayList<String> foodList = new ArrayList<String>();
        foodList.add("pizza");
        foodList.add("Hotdog");
        foodList.add("Donotes");

        ArrayList<String> book = new ArrayList<String>();
        book.add("Hindi");
        book.add("English");
        book.add("Science");

        ArrayList<String> contact = new ArrayList<String>();
        contact.add("contact 1");
        contact.add("contact 2");
        contact.add("contact 3");

        Some_Things.add(foodList);
        Some_Things.add(book);
        Some_Things.add(contact);
        System.out.println(Some_Things);
        System.out.println(Some_Things.get(1).get(0));
    }
}
