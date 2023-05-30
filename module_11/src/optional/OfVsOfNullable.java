package optional;

import java.util.Optional;

public class OfVsOfNullable {
    public static void main(String[] args) {
        String value = "Hello, World!";


        // Using Optional.of
        Optional<String> optional1 = Optional.of(value);
        optional1.orElseThrow(RuntimeException::new);
        System.out.println("Optional1: " + optional1.get());  // Output: "Optional1: Hello, World!"

        String nullValue = null;

        // Using Optional.ofNullable with a non-null value
        Optional<String> optional2 = Optional.ofNullable(value);
        System.out.println("Optional2: " + optional2.get());  // Output: "Optional2: Hello, World!"

        // Using Optional.ofNullable with a null value
        Optional<String> optional3 = Optional.ofNullable(nullValue);
        System.out.println("Optional3: " + optional3.isPresent());  // Output: "Optional3: false"
    }
}
