package com.pramod.scheduledthreadpool.scheduleatfixeddelay;

import com.pramod.scheduledthreadpool.LoopTask;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedDelayTP {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 5; i++) {
            System.out.println("Submitting task" + i + " " + new Date());
            LoopTask task = new LoopTask("task" + i);
            executorService.scheduleWithFixedDelay(task, 20, 10, TimeUnit.SECONDS);
        }
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
