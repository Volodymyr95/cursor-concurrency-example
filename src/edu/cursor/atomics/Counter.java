package edu.cursor.atomics;

public class Counter {
    int counter;

    public void increment() {
        counter++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment();

        System.out.println(counter.counter);



    }
}
