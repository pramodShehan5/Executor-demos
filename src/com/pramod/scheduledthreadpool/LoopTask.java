package com.pramod.scheduledthreadpool;

import java.util.Date;

public class LoopTask implements Runnable {
    private String taskName;

    public LoopTask(String taskName) {
        super();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start Time for " + taskName + " " + new Date());
        // Process task here
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End Time for " + taskName + " " + new Date());
    }
}