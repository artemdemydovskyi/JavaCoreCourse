package enums;

import java.util.Arrays;
import java.util.List;

public enum Pizza {
    MARGHERITA("Margherita", Arrays.asList("Tomato Sauce", "Mozzarella Cheese", "Basil")),
    PEPPERONI("Pepperoni", Arrays.asList("Tomato Sauce", "Mozzarella Cheese", "Pepperoni")),
    HAWAIIAN("Hawaiian", Arrays.asList("Tomato Sauce", "Mozzarella Cheese", "Ham", "Pineapple")),
    VEGETARIAN("Vegetarian", Arrays.asList("Tomato Sauce", "Mozzarella Cheese", "Mushrooms", "Bell Peppers", "Onions")),
    FOUR_CHEESE("Four cheese", Arrays.asList("Chedder","Mozzarela", "Cheese #3", "Cheese #4"));

    private final String name;
    private final List<String> toppings;

    Pizza(String name, List<String> toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return name + " Pizza";
    }
}
