package lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface ListProcessor {
    void process(List<Integer> list, int multiplier, String prefix);
}

public class ListProcessorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int multiplier = 2;
        String prefix = "Number: ";

        ListProcessor listProcessor = (list, multiplier1, prefix1) -> {
            list.forEach(num -> {
                int result = num * multiplier1;
                System.out.println(prefix1 + result);
            });
        };

        listProcessor.process(numbers, multiplier, prefix);
    }
}
