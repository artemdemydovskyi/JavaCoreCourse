package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalWithStreamJava8Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> firstEvenSquare = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .findFirst();

        if (firstEvenSquare.isPresent()) {
            System.out.println("First even square: " + firstEvenSquare.get());
        } else {
            System.out.println("No even squares found.");
        }
    }
}
