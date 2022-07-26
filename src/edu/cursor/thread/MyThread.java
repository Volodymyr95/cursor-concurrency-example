package edu.cursor.thread;


import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread{

    @Override
    public void run() {
        int inc = 0;
        ArrayList<String>   arrayList =  SharedArray.arrayList;
        arrayList.add("Inc2: "+ ++inc);

    }
}
