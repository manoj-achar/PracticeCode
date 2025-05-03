package com.practice.thread.es;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Object lockObj = new Object();
        service.submit(new PrintNumberThread(lockObj));
        service.submit(new PrintNumberThread(lockObj));
        service.submit(new PrintNumberThread(lockObj));
        service.submit(new PrintNumberThread(lockObj));
        service.shutdown();
    }
}
