package stream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        int minValue =
                Stream.of(13, 10, 4, 2, 17, 8)
                        .min(Integer::compareTo)
                        .get();

        System.out.println(minValue);
    }
}