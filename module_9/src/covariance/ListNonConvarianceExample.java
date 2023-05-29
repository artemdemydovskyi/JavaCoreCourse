package covariance;

import java.util.ArrayList;
import java.util.List;

class ListNonCovarianceExample {
    public static void main(String[] args) {

        List<Dog> dogsList = new ArrayList<>();
//         List<Animal> animalsList = dogsList; //

        System.out.println("\nNon-covariance in Generics:");
        // animalsList.add(new Cat()); // Compiler error: Type mismatch
        dogsList.add(new Dog());
        dogsList.get(0).makeSound(); // Output: Dog barks

        processAnimal(dogsList);
    }

    public static void processAnimal(List<? extends Animal> animals){
        System.out.println("Handled");
    }


}