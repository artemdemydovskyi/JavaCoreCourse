package lambda;

@FunctionalInterface
interface NumberComparator {
    boolean compare(int num1, int num2);
}

public class LambdaVsAnonymousExample {
    public static void main(String[] args) {

        NumberComparator comparator = new NumberComparator() {
            @Override
            public boolean compare(int num1, int num2) {
                return num1 > num2;
            }
        };

        System.out.println(comparator.compare(5, 3)); // Output: true

        NumberComparator comparator2 = (num1, num2) -> num1 > num2;

        System.out.println(comparator2.compare(5, 3)); // Output: true
    }
}
