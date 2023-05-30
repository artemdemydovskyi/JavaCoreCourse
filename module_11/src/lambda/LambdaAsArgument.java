package lambda;

interface Calculation {
    int performCalculation(int a, int b);
}

class Calculator {
    public void calc(int a, int b, Calculation calculation) {
        int result = calculation.performCalculation(a, b);
        System.out.println("Result: " + result);
    }
}

public class LambdaAsArgument {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.calc(2, 3, (int a, int b) -> a + b);
    }
}
