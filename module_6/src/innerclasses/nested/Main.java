package innerclasses.nested;

import java.util.List;

public class Main {

    public static void  main (String[]args){
        Restaurant restaurantNewSuperCool = new Restaurant();
        Restaurant.Menu menu = restaurantNewSuperCool.new Menu();


        Restaurant.MenuItem item1 = new Restaurant.MenuItem("Cheeseburger", 10.99, "Our classic cheeseburger with cheddar cheese, lettuce, tomato, and pickles.");
        Restaurant.MenuItem item2 = new Restaurant.MenuItem("Caesar Salad", 8.99, "Crisp romaine lettuce, croutons, parmesan cheese, and our signature Caesar dressing.");

        menu.addItem(item1);
        menu.addItem(item2);

// display the items on the menu
        List<Restaurant.MenuItem> items = menu.getItems();
        for (Restaurant.MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice() + "\n" + item.getDescription() + "\n");
        }

    }
}
