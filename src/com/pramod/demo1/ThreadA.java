package com.pramod.demo1;

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}


public class ThreadA {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        t1.start();
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}