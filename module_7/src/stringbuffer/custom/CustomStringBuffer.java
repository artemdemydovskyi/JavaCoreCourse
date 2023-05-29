package stringbuffer.custom;

/**
 * Custom implementation of a string buffer.
 */
public class CustomStringBuffer {

    private char[] value;
    private int count;

    /**
     * Constructs an empty string buffer with the specified initial capacity.
     *
     * @param capacity the initial capacity.
     */
    public CustomStringBuffer(int capacity) {
        value = new char[capacity];
    }

    /**
     * Appends the string representation of the specified argument to the buffer.
     *
     * @param obj the object to append.
     * @return a reference to this object.
     */
//    public CustomStringBuffer append(Object obj) {
//        return append(String.valueOf(obj));
//    }

    /**
     * Appends the specified string to the buffer.
     *
     * @param str the string to append.
     * @return a reference to this object.
     */
    public synchronized CustomStringBuffer append(String str) {
        int len = str.length();
        ensureCapacity(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    /**
     * Returns the current length of the buffer.
     *
     * @return the length of the buffer.
     */
    public synchronized int length() {
        return count;
    }

    /**
     * Returns the string buffer value.
     *
     * @return the value of the buffer.
     */
    public synchronized String toString() {
        return new String(value, 0, count);
    }

    /**
     * Ensures that the capacity of the buffer is at least the specified minimum.
     *
     * @param minimumCapacity the minimum capacity.
     */
    private void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > value.length) {
            expandCapacity(minimumCapacity);
        }
    }

    /**
     * Expands the capacity of the buffer.
     *
     * @param minimumCapacity the minimum capacity.
     */
    private void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;
        if (newCapacity < 0) {
            newCapacity = Integer.MAX_VALUE;
        } else if (minimumCapacity > newCapacity) {
            newCapacity = minimumCapacity;
        }
        char[] newValue = new char[newCapacity];
        System.arraycopy(value, 0, newValue, 0, count);
        value = newValue;
    }

}
