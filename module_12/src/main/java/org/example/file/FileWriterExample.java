package org.example.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    private static final int THREAD_COUNT = 22;
    private static final int ITERATIONS = 10000;
    private static final String FILE_PATH_MULTI = "module_12/src/main/java/org/example/file/output-multi.txt";
    private static final String FILE_PATH_SINGLE = "module_12/src/main/java/org/example/file/output-single.txt";

    public static void main(String[] args) {
        FileWriterExample example = new FileWriterExample();
        example.runSingleThreadedScenario();
        example.runMultithreadedScenario();
    }

    private void runSingleThreadedScenario() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS; i++) {
            writeToFileSingleThreaded();
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Single-threaded scenario:");
        System.out.println("Total time taken: " + totalTime + "ms");
        System.out.println("Average time per iteration: " + (totalTime / ITERATIONS) + "ms");
    }

    private void runMultithreadedScenario() {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < ITERATIONS / THREAD_COUNT; j++) {
                    writeToFileMultithreaded();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Multithreaded scenario:");
        System.out.println("Total time taken: " + totalTime + "ms");
        System.out.println("Average time per iteration: " + (totalTime / ITERATIONS) + "ms");
    }

    private void writeToFileSingleThreaded() {
        try (FileWriter writer = new FileWriter(FILE_PATH_SINGLE, true)) {
            writer.write("Single Thread\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void writeToFileMultithreaded() {
        try (FileWriter writer = new FileWriter(FILE_PATH_MULTI, true)) {
            writer.write("Multi Thread\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


