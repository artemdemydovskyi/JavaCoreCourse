package genericclass;

/**
 * A class representing a pair of values.
 *
 * @param <T1> the type of the first value
 * @param <T2> the type of the second value
 */
public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    /**
     * Constructs a pair with the specified first and second values.
     *
     * @param first  the first value of the pair
     * @param second the second value of the pair
     */
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Returns the first value of the pair.
     *
     * @return the first value of the pair
     */
    public T1 getFirst() {
        return first;
    }

    /**
     * Returns the second value of the pair.
     *
     * @return the second value of the pair
     */
    public T2 getSecond() {
        return second;
    }

    /**
     * Sets the first value of the pair.
     *
     * @param first the first value to set
     */
    public void setFirst(T1 first) {
        this.first = first;
    }

    /**
     * Sets the second value of the pair.
     *
     * @param second the second value to set
     */
    public void setSecond(T2 second) {
        this.second = second;
    }

    /**
     * Main method to demonstrate the usage of the {@code Pair} class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Apple", 10);
        System.out.println("First value: " + pair1.getFirst());
        System.out.println("Second value: " + pair1.getSecond());

        Pair<Boolean, Double> pair2 = new Pair<>(true, 3.14);
        System.out.println("First value: " + pair2.getFirst());
        System.out.println("Second value: " + pair2.getSecond());
    }
}
