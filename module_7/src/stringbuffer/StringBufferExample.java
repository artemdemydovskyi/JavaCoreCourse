package stringbuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.append("Thread 1: " + i);
                System.out.println(buffer.toString());
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.append("Thread 2: " + i);
                System.out.println(buffer.toString());
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.append("Thread 3: " + i);
                System.out.println(buffer.toString());
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}