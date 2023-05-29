package immutable.whyimmutable;


public class MutableCounter extends ImmutableCounter {
    private int count;

    public MutableCounter(int initCount) {
        super(initCount);

        this.count = initCount;
    }

    public int getCount() {
        return this.count;
    }

    public void setNewCount(int newCount) {
        this.count = newCount;
    }
}
