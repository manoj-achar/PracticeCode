package com.practice.lamda;

@FunctionalInterface
public interface Vehicle {
    void startEngine();
    default int addNum(int a, int b) {
        return a + b;
    }
}
