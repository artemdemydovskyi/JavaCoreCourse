package immutable.counter;

public class ImmutableCounterTest {
    public static void main(String[] args) throws InterruptedException {

        final ImmutableCounter counter = new ImmutableCounter(0);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    ImmutableCounter newCounter = counter.increment();
                    int expectedValue = counter.getValue() + 1;
                    int actualValue = newCounter.getValue();
                    System.out.println(Thread.currentThread().getName() + ": expected " + expectedValue + ", actual " + actualValue);
                    assert actualValue == expectedValue;
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
