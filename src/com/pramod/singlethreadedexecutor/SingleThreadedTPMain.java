package com.pramod.singlethreadedexecutor;

import com.pramod.scheduledthreadpool.LoopTask;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadedTPMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            System.out.println("Submitting task" + i + " " + new Date());
            LoopTask task = new LoopTask("task" + i);
            executorService.submit(task);
        }
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}