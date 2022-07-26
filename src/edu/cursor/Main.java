package edu.cursor;

import edu.cursor.thread.MyRunnable;
import edu.cursor.thread.MyThread;
import edu.cursor.thread.SharedArray;

public class Main {

    public static void main(String[] args) {


        MyThread myThread = new MyThread();
        Thread thread = new Thread(new MyRunnable());

        thread.run();
        myThread.run();

        System.out.println(new SharedArray().arrayList.get(0));


    }
}
