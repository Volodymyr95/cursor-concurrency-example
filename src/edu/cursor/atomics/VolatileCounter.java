package edu.cursor.atomics;

public class VolatileCounter {
    private volatile int counter;


    // counter = 2+2;

    public synchronized void increment() {
        counter++;
    }
}
