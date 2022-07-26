package edu.cursor.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedCollectionsMain {
    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>();


     //   HashMap map = (HashMap) Collections.synchronizedMap(new HashMap<>());
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
      //  CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();


    }
}
