package immutable.person;

import java.time.LocalDate;
import java.util.List;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final List<String> hobbies;

    public Person(String firstName, String lastName, LocalDate birthDate, List<String> hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hobbies = List.copyOf(hobbies);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
