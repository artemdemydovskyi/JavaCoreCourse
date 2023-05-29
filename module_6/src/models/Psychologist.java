package models;

import java.util.List;

public class Psychologist extends Specialist {

    // Constructor
    public Psychologist(String name, int age, int yearsOfExperience, List<String> diplomas) {
        super(name, age, yearsOfExperience, diplomas);
    }

    //Constructor for an unexperienced psychologist
    public Psychologist(String name, int age, List<String> diplomas) {
        this(name, age, 0, diplomas);
    }
}