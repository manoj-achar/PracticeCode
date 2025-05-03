package com.practice.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintNumberUsingESCF {
    // Print even and odd using two threads using java 8 ExecutorService and CpmpletableFuture
    static ExecutorService executorService = Executors.newFixedThreadPool(2);
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(num -> {
            CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num)
                    .thenApplyAsync(digit -> {
                        if(digit % 2 == 0) {
                            System.out.println("Thread "+Thread.currentThread().getName()+" : value = "+digit);
                        }
                        return num;
                    }, executorService);
            evenCompletableFuture.join();
            CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num)
                    .thenApplyAsync(digit -> {
                        if(digit % 2 != 0) {
                            System.out.println("Thread "+Thread.currentThread().getName()+" : value = "+digit);
                        }
                        return num;
                    }, executorService);
            oddCompletableFuture.join();
        });
        executorService.shutdown();
    }
}
