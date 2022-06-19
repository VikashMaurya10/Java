package Basic.Array;

import java.util.ArrayList;
// This is one dimentional ArrayList.
public class ArrayList1 {
    public static void main(String[] args) {
        String names[] = {"Vikash","Maurya","Vishal"};
        // ArrayList<String> names = new ArrayList<String>();
        // names.add("Vikash");
        // names.add("Maurya");
        // names.add("Vishal");
        // Some mathod on the ArrayList.
        // names.add(0, "Element");
        // names.set(1, "Vinnu");
        // names.remove(0);
        // names.clear();
        // for (int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }
        for (String i : names) {
            System.out.println(i);
        }
    }
}
