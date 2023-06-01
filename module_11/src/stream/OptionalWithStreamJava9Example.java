package stream;

import java.util.Arrays;
import java.util.List;

public class OptionalWithStreamJava9Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .findFirst()
                .ifPresentOrElse(
                        value -> System.out.println("First even square: " + value),
                        () -> System.out.println("No even squares found.")
                );
    }
}
