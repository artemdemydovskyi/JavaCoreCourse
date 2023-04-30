package models;

import java.util.List;

public class Psychotherapist extends Specialist {

    public enum Approach {CBT, PSYCHODYNAMIC, HUMANISTIC}

    private Approach approach;

    // Constructor
    public Psychotherapist(String name, int age, int yearsOfExperience, List<String> diplomas, Approach approach) {
        super(name, age, yearsOfExperience, diplomas);
        this.approach = approach;
    }

    // Getters and setters
    public Approach getApproach() {
        return approach;
    }

    public void setApproach(Approach approach) {
        this.approach = approach;
    }
}