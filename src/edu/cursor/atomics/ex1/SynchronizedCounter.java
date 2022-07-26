package edu.cursor.atomics.ex1;

public class SynchronizedCounter {
    public static void main(String[] args)
            throws InterruptedException {

        SyncCounter c = new SyncCounter();

        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");

        first.start();
        second.start();

        first.join();
        second.join();


        System.out.println(c.count);
    }


}

class SyncCounter extends Thread {
    volatile int  count = 0;

    public synchronized void run() {

        int max = 1_000_00_000;

        for (int i = 0; i < max; i++) {
            count++;
        }
    }
}
