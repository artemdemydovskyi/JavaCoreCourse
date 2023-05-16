package covariance;

class ArrayCovarianceExample {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        Animal[] animals = dogs; // Covariant assignment

        animals[0] = new Cat(); // Compiles, but throws ArrayStoreException at runtime

        System.out.println("Covariance in Arrays:");
        animals[0].makeSound(); // Throws ArrayStoreException at runtime
//        dogs[0].makeSound(); // Output: Dog barks
    }
}