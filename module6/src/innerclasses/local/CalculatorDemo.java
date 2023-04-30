package innerclasses.local;

import innerclasses.Calculator;

public class CalculatorDemo {

    public static void main(String[] args) {
        // Implementing the Calculator interface with a local class
        class Adder implements Calculator {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        }
        Adder adder = new Adder();

        // Using the adder Calculator
        int result = adder.calculate(3, 4);
        System.out.println(result); // Output: 7
    }
}