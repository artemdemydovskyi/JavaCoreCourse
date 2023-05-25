package org.example;

import java.io.*;

public class ObjectStreamExample {
    public static void main(String[] args) {
        writeObjectsToFile();
        readObjectsFromFile();
    }

    private static void writeObjectsToFile() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("module10/src/main/java/org/example/objects.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            // Write objects to the file
            objectOutputStream.writeObject(new Pupil("Pedro Pascal", 12));
            objectOutputStream.writeObject(new Pupil("Ragnar Loðbrók", 16));
            objectOutputStream.writeObject(new Pupil("Bobby Dobby", 15));

            System.out.println("Objects written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing objects to file: " + e.getMessage());
        }
    }

    private static void readObjectsFromFile() {
        try (FileInputStream fileInputStream = new FileInputStream("module10/src/main/java/org/example/objects.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            System.out.println("Reading objects from file:");

            // Read objects from the file until the end
            while (true) {
                try {
                    Object obj = objectInputStream.readObject();
                    if (obj instanceof Pupil) {
                        Pupil pupil = (Pupil) obj;
                        System.out.println("Read Pupil: " + pupil);
                    }
                } catch (ClassNotFoundException e) {
                    System.out.println("Error reading object: " + e.getMessage());
                } catch (EOFException e) {
                    break; // Reached end of file
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

class Pupil implements Serializable {

    private static final long serialVersionUID = 3998269204142884187L;
    private final String name;
    private final int age;

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
