package innerclasses.anonymous;

import innerclasses.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        // Implementing the Calculator interface with an anonymous class
        Calculator adder = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // Using the adder Calculator
        int result = adder.calculate(3, 4);
        System.out.println(result); // Output: 7
    }
}