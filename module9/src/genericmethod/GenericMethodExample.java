package genericmethod;

import java.util.Arrays;

public class GenericMethodExample {


    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(numbers));
        swap(numbers, 1, 3);
        System.out.println("After swap: " + Arrays.toString(numbers));

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Before swap: " + Arrays.toString(names));
        swap(names, 0, 2);
        System.out.println("After swap: " + Arrays.toString(names));
    }
}
