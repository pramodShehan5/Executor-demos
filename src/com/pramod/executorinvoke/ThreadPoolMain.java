package com.pramod.executorinvoke;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callableSet = new HashSet<Callable<String>>();

        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                System.out.println("task1");
                return "task1";
            }
        });
        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                System.out.println("task2");
                return "task2";
            }
        });
        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                System.out.println("task3");
                return "task3";
            }
        });

        String result = null;
        try {
            result = executorService.invokeAny(callableSet);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Final result => " + result);

        executorService.shutdown();
    }
}
