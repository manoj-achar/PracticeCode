package com.practice.thread;

public class PrintNumberThread implements Runnable{

    private static int counter = 1;
    Object lock;

    public PrintNumberThread(Object lock, String name) {
        this.lock = lock;
        Thread.currentThread().setName(name);
    }

    @Override
    public void run() {
        while(counter <= 10) {
            if(counter%2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (lock) {
                    System.out.println("Thread even " + counter);
                    counter++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(counter%2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (lock) {
                    System.out.println("Thread odd " + counter);
                    counter++;
                    lock.notify();
                }
            }
        }
    }
}
