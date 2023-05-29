import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // Raw type ArrayList without generics
        ArrayList list = new ArrayList();
        list.add("Hello"); // Adding a String
        list.add(123);     // Adding an Integer

        String item1 = (String) list.get(0); // Explicit casting needed
        int item2 = (int) list.get(1);       // Explicit casting needed

        // ArrayList with generics
        List<String> genericList = new ArrayList<>();
        genericList.add("Hello"); // Adding a String
//        genericList.add(123);   // Compiler error: incompatible types

        String genericItem = genericList.get(0); // No casting needed

        System.out.println("Raw Type Example:");
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);

        System.out.println("\nGenerics Example:");
        System.out.println("Generic Item: " + genericItem);
    }
}
