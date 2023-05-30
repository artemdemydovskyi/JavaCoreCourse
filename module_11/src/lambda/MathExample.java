package lambda;

@FunctionalInterface
interface MathOperation {
    double operate(int a, int b);
}

public class MathExample {


    public static void main(String[] args) {
        // Lambda expression with multiple parameters

        MathOperation mathOperation = new MathOperation() {
            @Override
            public double operate(int a, int b) {
                return a + b;
            }
        };

        MathOperation addition = (a, b) -> adder(a,b);
//        MathOperation subtraction = (a, b) -> a - b;
//        MathOperation multiplication = (a, b) -> a * b;
//
//        // Using lambda expressions
//        double result1 = performOperation(5, 3, addition);
//        double result2 = performOperation(5, 3, subtraction);
//        double result3 = performOperation(5, 3, multiplication);
//
//        System.out.println("Addition result: " + result1);
//        System.out.println("Subtraction result: " + result2);
//        System.out.println("Multiplication result: " + result3);
//    }
//
//    private static double performOperation(int a, int b, MathOperation operation) {
//        return operation.operate(a, b);
//    }
        System.out.println(addition.operate(2,3));
    }

    public static double adder(int a, int b) {
        double c = a + b;
        c /= 2;
        c += 450650;
        return c;
    }
}
