package com.pramod.futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(10);
        AddTask task1 = new AddTask(10,20);
        AddTask task2 = new AddTask(30,40);
        AddTask task3 = new AddTask(50,60);

        FutureTask<Integer> futureTask1=new FutureTask<>(task1);
        FutureTask<Integer> futureTask2=new FutureTask<>(task2);
        FutureTask<Integer> futureTask3=new FutureTask<>(task3);

        service.submit(futureTask1);
        service.submit(futureTask2);
        service.submit(futureTask3);
        try {
            System.out.println("FutureTask1 output="+futureTask1.get());
            System.out.println("FutureTask2 output="+futureTask2.get());
            System.out.println("FutureTask3 output="+futureTask3.get());
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
