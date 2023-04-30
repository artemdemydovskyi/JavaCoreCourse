package innerclasses.nested;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    // other fields and methods here

    public class Menu {
        private List<MenuItem> items;

        public Menu() {
            this.items = new ArrayList<>();
        }

        public void addItem(MenuItem item) {
            items.add(item);
        }

        public List<MenuItem> getItems() {
            return items;
        }
    }

    public static class MenuItem {
        private String name;
        private double price;
        private String description;

        public MenuItem(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        // getters and setters for name, price, and description here
    }
}