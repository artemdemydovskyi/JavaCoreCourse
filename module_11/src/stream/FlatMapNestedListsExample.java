package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapNestedListsExample {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream) // Flatten the nested lists into a single stream
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }
}
