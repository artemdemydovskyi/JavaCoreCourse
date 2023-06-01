package stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Приклад 1: Обчислення суми елементів за допомогою зведення потоку
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Сума: " + sum); // Виведе: Сума: 15

        // Приклад 2: Знаходження максимального значення за допомогою зведення потоку
        int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Максимум: " + max); // Виведе: Максимум: 5
    }
}
