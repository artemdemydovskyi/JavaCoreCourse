package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional with a non-null value
        Optional<String> optionalValue = Optional.of("Hello, World!");

        // Check if the Optional has a value
        if (optionalValue.isPresent()) {
            System.out.println("Optional has a value: " + optionalValue.get());
        } else {
            System.out.println("Optional is empty");
        }

        // Create an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Use orElse to provide a default value
        String value1 = emptyOptional.orElse("Default Value");
        System.out.println("Value 1: " + value1);  // Output: "Default Value"

        // Use orElseGet with a Supplier to provide a default value
        String value2 = emptyOptional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value 2: " + value2);  // Output: "Default Value from Supplier"

        // Use map to transform the Optional value
        Optional<String> transformedOptional = optionalValue.map(s -> s.toUpperCase());
        String transformedValue = transformedOptional.orElse("No value");
        System.out.println("Transformed Value: " + transformedValue);  // Output: "HELLO, WORLD!"
    }
}
