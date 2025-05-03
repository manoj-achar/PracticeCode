package com.practice.thread.es;

import java.util.stream.IntStream;

public class PrintNumberThread implements Runnable {

    Object obj;
    public PrintNumberThread(Object lock) {
        obj = lock;
    }
    private static void printNumber(int num) {
        System.out.println("Thread "+Thread.currentThread().getName() + " : num = "+num);
    }
    @Override
    public void run() {
        synchronized (obj) {
            try {
                IntStream.rangeClosed(1, 20).forEach(PrintNumberThread::printNumber);
                obj.notify();
                obj.wait();
            }catch (Exception exp) {
                exp.printStackTrace();
            }
        }
    }
}
