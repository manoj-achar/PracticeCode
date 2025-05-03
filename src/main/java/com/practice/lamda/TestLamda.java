package com.practice.lamda;

public class TestLamda {
    public static void main(String[] args) {
        PrintMessage print = (message) -> System.out.println(message);
        print.printMessage("Hello Java");

    }
}
