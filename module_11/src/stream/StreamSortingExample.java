package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Pupil {
    private String name;
    private int age;

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamSortingExample {
    public static void main(String[] args) {
        List<Pupil> people = new ArrayList<>();
        people.add(new Pupil("Alice", 12));
        people.add(new Pupil("John", 8));
        people.add(new Pupil("Robert", 9));
        people.add(new Pupil("Emily", 10));
        people.add(new Pupil("Michael", 17));

        // Sorting the people based on age in ascending order
        List<Pupil> sortedPeople = people.stream()
                .sorted(Comparator.comparingInt(Pupil::getAge).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted People: " + sortedPeople);
    }
}
