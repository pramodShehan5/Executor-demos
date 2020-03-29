package com.pramod.cachedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            LoopTask task = new LoopTask("task" + i);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}
