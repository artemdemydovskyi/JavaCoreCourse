package org.example.join;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Stream<Integer> ints1 = Stream.of(1,2,3,4);
        Stream<Integer> ints2 = Stream.of(5,6,7,8);

        List<Integer> list = Stream.concat(ints1,ints2).sorted(Comparator.comparing(e-> new Random().nextInt())).collect(Collectors.toList());
//        Printer printer1 = new Printer("Pedro Pascal");
//        Thread thread1 = new Thread(printer1);
//        thread1.start();
//        thread1.join();
//        System.out.println("HELLO");
    }
}

