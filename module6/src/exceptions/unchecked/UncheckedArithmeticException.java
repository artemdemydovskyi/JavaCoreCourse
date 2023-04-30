package exceptions.unchecked;

public class UncheckedArithmeticException {

    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println(
                    "Oh my God! You're not eligible to divide by zero");
        }
    }
}
