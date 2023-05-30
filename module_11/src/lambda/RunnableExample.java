package lambda;

public class RunnableExample {
    public static void main(String[] args) {
        // Creating and executing a thread using lambda expression
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread executing: " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
