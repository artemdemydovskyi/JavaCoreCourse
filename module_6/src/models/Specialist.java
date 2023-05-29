package models;

import java.util.List;

public class Specialist {
    private String name;
    private int age;
    private int yearsOfExperience;
    private List<String> diplomas;

    // Constructor
    public Specialist(String name, int age, int yearsOfExperience, List<String> diplomas) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.diplomas = diplomas;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<String> getDiplomas() {
        return diplomas;
    }

    public void setDiplomas(List<String> diplomas) {
        this.diplomas = diplomas;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearsOfExperience=" + yearsOfExperience +
                ", diplomas=" + diplomas +
                '}';
    }
}