package genericclass;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic class that represents a box containing items of type T.
 *
 * @param <T> the type of items stored in the box
 */
public class Box<T> {
    private List<T> content;

    /**
     * Constructs an empty box.
     */
    public Box() {
        content = new ArrayList<>();
    }

    /**
     * Puts an item into the box.
     *
     * @param item the item to put into the box
     */
    public void put(T item) {
        content.add(item);
    }

    /**
     * Retrieves the item from the box.
     *
     * @return the item in the box
     * @throws IllegalStateException if the box is empty
     */
    public T get() {
        if (content.isEmpty()) {
            throw new IllegalStateException("Box is empty");
        }
        return content.get(content.size() - 1);
    }

    /**
     * Main method to demonstrate the usage of the {@code Box} class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello, World!");
        String str = stringBox.get();
        System.out.println(str);

        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);
        int num = integerBox.get();
        System.out.println(num);

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.put(true);
        boolean flag = booleanBox.get();
        System.out.println(flag);
    }
}
