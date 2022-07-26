package edu.cursor.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };

        /*

        Callable c () ->  10 mins return "some code"
        Future<String> result = c.call();
        result.get(); => "some code"

         */


    }
}
