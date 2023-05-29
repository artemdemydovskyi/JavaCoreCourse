import innerclasses.Calculator;

class Adder implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}