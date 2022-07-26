package edu.cursor.thread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        int increment = 0;

        ArrayList<String> arrayList =  SharedArray.arrayList;


        //  |     {1,5,3,4,5,5,6}   {1,5,3,4,5,5,6}     |

        arrayList.add("Inc: " + ++increment);

    }
}
