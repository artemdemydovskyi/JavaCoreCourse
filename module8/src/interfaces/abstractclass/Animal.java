package interfaces.abstractclass;

public abstract class Animal {
    protected String name;
    private int age;
    public static final String CATEGORY = "Animal";
    public transient boolean isWild;
    public volatile boolean isRunning;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}
