package edu.cursor.atomics.ex1;

import java.util.concurrent.atomic.AtomicInteger;

class AtCounter extends Thread {

    AtomicInteger count;

    AtCounter() {
        count = new AtomicInteger();
    }

    public void run() {

        int max = 1_000_00_000;

        for (int i = 0; i < max; i++) {
            count.addAndGet(1);
        }
    }
}

public class AtomicCounter {
    public static void main(String[] args)
            throws InterruptedException {

        AtCounter c = new AtCounter();

        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(c.count);
    }
}

