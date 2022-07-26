package edu.cursor.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
//
//
//
//
//        service.execute(new Runnable() {
//            public void run() {
//                System.out.println("Another thread was executed");
//            }
//        });



//
        ExecutorService service1 = Executors.newSingleThreadExecutor();
        ExecutorService service2 = Executors.newFixedThreadPool(3);
        ExecutorService service3 = Executors.newScheduledThreadPool(3);
//    }
//}
    }
}
