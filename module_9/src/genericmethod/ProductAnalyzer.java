package genericmethod;

import java.util.List;

/**
 * A class that provides methods to analyze and process product data.
 */
public class ProductAnalyzer {

    /**
     * Finds the highest priced item in a list of products.
     *
     * @param <T>      the type of the product
     * @param products the list of products to analyze
     * @return the highest priced item in the list
     * @throws IllegalArgumentException if the product list is empty or null
     */
    public static <T extends Product> T findHighestPricedItem(List<T> products) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("genericmethod.Product list is empty or null");
        }

        T highestPricedItem = products.get(0);
        for (T product : products) {
            if (product.getPrice() > highestPricedItem.getPrice()) {
                highestPricedItem = product;
            }
        }

        return highestPricedItem;
    }

    /**
     * Main method to demonstrate the usage of the {@code findHighestPricedItem} method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Java Programming", "John Doe", 49.99),
                new Book("Python Basics", "Jane Smith", 39.99),
                new Book("C# Mastery", "Alice Johnson", 59.99)
        );

        Book highestPricedBook = findHighestPricedItem(books);
        System.out.println("Highest priced book: " + highestPricedBook);

        List<Car> cars = List.of(
                new Car("Toyota Camry", "Red", 25000),
                new Car("Honda Civic", "Blue", 22000),
                new Car("Ford Mustang", "Yellow", 40000)
        );

        Car highestPricedCar = findHighestPricedItem(cars);
        System.out.println("Highest priced car: " + highestPricedCar);
    }
}

/**
 * A base class representing a product.
 */
class Product {
    private String name;
    private double price;

    /**
     * Constructs a product with the specified name and price.
     *
     * @param name  the name of the product
     * @param price the price of the product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the product.
     *
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the product.
     *
     * @return a string representation of the product
     */
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

/**
 * A subclass representing a book.
 */
class Book extends Product {
    private final String author;

    /**
     * Constructs a book with the specified name, author, and price.
     *
     * @param name   the name of the book
     * @param author the author of the book
     * @param price  the price of the book
     */
    public Book(String name, String author, double price) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Car extends Product {
    private final String color;

    public Car(String name, String color, double price) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

