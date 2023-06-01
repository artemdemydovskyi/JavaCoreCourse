package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// HOMEWORK TASK
public class MapFilterExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");

        List<String> transformedFruits = fruits.stream()
                .map(String::toUpperCase)
                .filter(fruit -> fruit.startsWith("A"))
                .map(fruit -> fruit + "S")
                .filter(fruit -> fruit.length() > 5)
                .collect(Collectors.toList());

        System.out.println(transformedFruits);
    }
}
