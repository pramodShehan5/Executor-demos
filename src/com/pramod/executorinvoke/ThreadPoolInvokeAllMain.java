package com.pramod.executorinvoke;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolInvokeAllMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callableSet = new HashSet<Callable<String>>();

        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                return "pramod";
            }
        });
        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                return "diluna";
            }
        });
        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                return "navod";
            }
        });
        callableSet.add(new Callable<String>() {
            public String call() throws Exception {
                return "hiruna";
            }
        });

        List<Future<String>> futureList = executorService.invokeAll(callableSet);

        for(Future<String> future : futureList){
            System.out.println("future.get result => " + future.get());
        }

        executorService.shutdown();
    }
}
