package immutable.person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<String> hobbies = Arrays.asList("Reading", "Swimming");
        Person person = new Person("John", "Doe", LocalDate.of(1990, 1, 1), hobbies);

        // Test getters
        assert person.getFirstName().equals("John");
        assert person.getLastName().equals("Doe");
        assert person.getBirthDate().equals(LocalDate.of(1990, 1, 1));
        assert person.getHobbies().equals(Arrays.asList("Reading", "Swimming"));

        // Test that hobbies list is immutable
        try {
            person.getHobbies().add("Skiing"); // Should throw UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.err.println("Cannot add to an immutable list");
        }
    }
}
