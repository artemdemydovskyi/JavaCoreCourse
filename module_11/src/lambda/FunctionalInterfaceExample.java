package lambda;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        final Person person = new Person("John"); // effectively final object

        Runnable runnable = () -> {
            // Uncommenting the following line will cause a compile error
            // person.setName("Mike"); // Attempting to modify the effectively final object
            System.out.println(person.getName());
        };

        runnable.run(); // Invoke the runnable
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
