package org.example;

/**
 * A program that displays the elapsed time since its execution started every second,
 * and another thread that prints a message every 5 seconds.
 */
public class TimeTracker {

    /**
     * The main entry point of the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Thread timeThread = new Thread(new TimePrinterRunnable());
        Thread messageThread = new Thread(new MessagePrinterRunnable());

        timeThread.start();
        messageThread.start();
    }
}

/**
 * A {@link Runnable} implementation that prints the elapsed time since the execution started every second.
 */
class TimePrinterRunnable implements Runnable {

    /**
     * The run method that executes the time tracking logic.
     */
    public void run() {
        long startTime = System.currentTimeMillis();

        while (true) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;
            System.out.println("Витрачено часу: " + (elapsedTime / 1000) + " с.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * A {@link Runnable} implementation that prints a message every 5 seconds.
 */
class MessagePrinterRunnable implements Runnable {

    /**
     * The run method that executes the message printing logic.
     */
    public void run() {
        while (true) {
            System.out.println("Минуло 5 секунд.");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
