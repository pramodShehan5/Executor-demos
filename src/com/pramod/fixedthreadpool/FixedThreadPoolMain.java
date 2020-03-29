package com.pramod.fixedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolMain {
    public static void main(String[] args) {

//        ThreadPoolExecutor executorService = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++){
            LoopTask task = new LoopTask("task" + i);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}
