package com.practice.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMultiThread {
    public static void main(String[] args) {
        Object lockObj = new Object();
        Runnable thread1 = new PrintNumberThread(lockObj, "even");
        Runnable thread2 = new PrintNumberThread(lockObj, "odd");
        //new Thread(thread1, "even").start();
        //new Thread(thread2, "odd").start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(thread1, thread2);
        //executorService.submit(thread2);
        executorService.shutdown();

    }
}
