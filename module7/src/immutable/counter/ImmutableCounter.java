package immutable.counter;

public final class ImmutableCounter {
    private final int value;

    public ImmutableCounter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableCounter increment() {
        return new ImmutableCounter(value + 1);
    }
}
