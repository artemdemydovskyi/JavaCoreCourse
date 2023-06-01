package stream;

import java.util.Arrays;

public class ParallelStreamComparison {
    public static void main(String[] args) {
        int[] numbers = new int[10_000_00000];
        Arrays.fill(numbers, 1);

        // Sequential stream processing
        long sequentialStartTime = System.currentTimeMillis();

        int sequentialResult = Arrays.stream(numbers)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        long sequentialEndTime = System.currentTimeMillis();
        long sequentialTime = sequentialEndTime - sequentialStartTime;

        System.out.println("Sequential Result: " + sequentialResult);
        System.out.println("Sequential Time: " + sequentialTime + "ms");

        // Parallel stream processing
        long parallelStartTime = System.currentTimeMillis();
        int parallelResult = Arrays.stream(numbers)
                .parallel()
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        long parallelEndTime = System.currentTimeMillis();
        long parallelTime = parallelEndTime - parallelStartTime;

        System.out.println("Parallel Result: " + parallelResult);
        System.out.println("Parallel Time: " + parallelTime + "ms");
    }
}
