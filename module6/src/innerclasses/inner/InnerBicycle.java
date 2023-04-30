package innerclasses.inner;

public class InnerBicycle {

    private String model;
    private int weight;

    public InnerBicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Go!");
    }

    public class HandleBar {
        public  int r = 10;
        public void right() {
            System.out.println("Turn right!");
        }

        public void left() {

            System.out.println("Turn left!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("The seat is raised!");
        }

        public void down() {

            System.out.println("The seat is lowered!");
        }
    }
}