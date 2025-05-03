package com.practice.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLamdaStream {
    public static void main(String[] args) {
        try{
            List<Integer> integerList = Arrays.asList(23, 5, 7, 5, 8, 9, 10, 6, 44, 6, 7, 9, 1, 4, 6);
            testMaxofIntegerList(integerList);
            printMinimumOfList(integerList);
            printSumOfList(integerList);
            printAverageOfIntList(integerList);
            printMaxOfEven(integerList);
            printMaxOfOdd(integerList);
            printDuplicateElementsFromList(integerList);

        }catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    public static void testMaxofIntegerList(List<Integer> integerList) {
        Integer maxInteger = integerList.stream().max(Integer::compareTo).get();
        System.out.println("Maximum = "+maxInteger);
    }
    public static void printMinimumOfList(List<Integer> integerList) {
        Integer minInteger = integerList.stream().min(Integer::compareTo).get();
        System.out.println("Minimum = "+minInteger);
    }
    public static void printSumOfList(List<Integer> integerList) {
        Integer sumOfIntegers = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all numbers = "+sumOfIntegers);
    }
    public static  void printAverageOfIntList(List<Integer> integerList) {
        double averageOfIntList = integerList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average of all numbers = "+averageOfIntList);
    }
    public static void printMaxOfEven(List<Integer> integerList) {
        Integer maxOfInt = integerList.stream().filter((num) -> num % 2 == 0).mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Maximum of even = "+maxOfInt);
    }
    public static void printMaxOfOdd(List<Integer> integerList) {
        int maxOfOdd = integerList.stream().filter((num) -> num % 2 != 0).mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Maximum of odd = "+maxOfOdd);
    }
    private static void printDuplicateElementsFromList(List<Integer> integerList) {
        List<Integer> duplicateIntList = integerList.stream().filter((num) -> Collections.frequency(integerList, num) > 1).toList();
        System.out.println(duplicateIntList);
    }
}
