package immutable.whyimmutable;

// An example of class that should be immutable by design but doesn't have a final keyword
public class ImmutableCounter {
    private final int count;

    public ImmutableCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
