package com.pramod.demo1;

//class Task implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Thread name : " + Thread.currentThread().getName());
//    }
//}

public class ThreadC {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            Thread t1 = new Thread(new Task());
            t1.start();
        }
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}