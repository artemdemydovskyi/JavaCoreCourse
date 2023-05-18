package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 65);
        hashMap.put("Orange", 50);
        hashMap.put("Mango", 90);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Access values using keys
        int appleCount = hashMap.get("Apple");
        System.out.println("Number of Apples: " + appleCount);

        // Check if a key exists
        boolean containsBanana = hashMap.containsKey("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Update a value
        hashMap.put("Orange", 12);

        // Remove a key-value pair
        hashMap.remove("Mango");

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + hashMap);

        // Iterate over the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Check if the HashMap is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);

        // Get the size of the HashMap
        int size = hashMap.size();
        System.out.println("HashMap size: " + size);
    }
}
