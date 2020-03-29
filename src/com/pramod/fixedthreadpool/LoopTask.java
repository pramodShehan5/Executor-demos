package com.pramod.fixedthreadpool;

public class LoopTask implements Runnable {
    private String taskName;

    public LoopTask(String taskName) {
        super();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Starting " + taskName);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Executing " + taskName + " with " + Thread.currentThread().getName() + " => " + i);
        }
        System.out.println("Ending " + taskName);
    }
}
