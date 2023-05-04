package immutable.stringbuilder.custom;

import java.util.Arrays;

/**
 * A simple custom implementation of the StringBuilder class.
 */
public class MyStringBuilder {

    private char[] value;  // the underlying character array
    private int count;     // the number of characters currently in the buffer

    /**
     * Constructs a new, empty MyStringBuilder with the default capacity (16).
     */
    public MyStringBuilder() {
        this.value = new char[16];
        this.count = 0;
    }

    /**
     * Constructs a new MyStringBuilder with the specified initial capacity.
     *
     * @param capacity the initial capacity of the buffer.
     * @throws IllegalArgumentException if the specified capacity is negative.
     */
    public MyStringBuilder(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }
        this.value = new char[capacity];
        this.count = 0;
    }

    /**
     * Returns the current length of the character sequence.
     *
     * @return the number of characters currently in the buffer.
     */
    public int length() {
        return count;
    }

    /**
     * Appends the specified string to the end of the buffer.
     *
     * @param str the string to be appended.
     * @return a reference to this MyStringBuilder.
     */
    public MyStringBuilder append(String str) {
        if (str == null) {
            str = "null";
        }
        int len = str.length();
        ensureCapacity(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    /**
     * Ensures that the buffer has at least the specified capacity.
     * If not, the buffer is resized to twice its current size plus 2.
     *
     * @param minCapacity the minimum capacity required.
     */
    private void ensureCapacity(int minCapacity) {
        if (minCapacity - value.length > 0) {
            expandCapacity(minCapacity);
        }
    }

    /**
     * Expands the capacity of the buffer to at least the specified minimum.
     *
     * @param minCapacity the minimum capacity required.
     */
    private void expandCapacity(int minCapacity) {
        int newCapacity = value.length * 2 + 2;
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        if (newCapacity < 0) {
            if (minCapacity < 0) {
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value, newCapacity);
    }

    /**
     * Returns a string representation of the character sequence in the buffer.
     *
     * @return a string containing the characters in the buffer.
     */
    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
