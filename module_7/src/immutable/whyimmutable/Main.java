package immutable.whyimmutable;

public class Main {

    public static void main(String[] args) {
        MutableCounter mutableCounter = new MutableCounter(2);
        ImmutableCounter immutableCounter = mutableCounter;

        System.out.println("IMMUTABLE_COUNTER: " + immutableCounter.getCount());

        mutableCounter.setNewCount(10);

        System.out.println("IMMUTABLE_COUNTER_NEW: " + immutableCounter.getCount());
    }
}
