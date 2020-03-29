package com.pramod.scheduledthreadpool.schedule;

import com.pramod.scheduledthreadpool.LoopTask;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ScheduleThreadPoolMain {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            System.out.println("Submitting task" + i + " " + new Date());
            LoopTask task = new LoopTask("task" + i);
            executorService.schedule(task, 20, TimeUnit.SECONDS);
        }
        executorService.shutdown();
    }
}
