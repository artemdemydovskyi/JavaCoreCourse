package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Mango");

        List<String> sortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedFruits); // Output: [Apple, Banana, Mango, Orange]
    }
}
