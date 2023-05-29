package innerclasses.inner;

public class Main {
    public static void main (String [] args) {
        InnerBicycle innerBicycle = new InnerBicycle("УКРАЇНА", 33);
        InnerBicycle.HandleBar handleBar = innerBicycle.new HandleBar();
    }
}
