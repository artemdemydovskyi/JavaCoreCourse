package org.example.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

    }
}
