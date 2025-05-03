package com.practice.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamApi {
    public static void print(Object line) {
        System.out.print(line+" ");
    }
    public static void printLine(Object line) {
        System.out.println(line);
    }
    public static void main(String[] args) {
        List<Integer> intLists = Arrays.asList(2, 6, 3, 8, 9, 17, 45, 7, 8, 9, 6, 45, 30);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100, "Rohith", 30, "Platform", "Male", 40000));
        employeeList.add(new Employee(101, "Sukesh", 27,  "Testing", "Male", 35000));
        employeeList.add(new Employee(102,  "Manish", 36, "Support", "Male", 80000));
        employeeList.add(new Employee(103,  "Shreya", 38, "Testing", "Female", 50000));
        employeeList.add(new Employee(104, "Anusha", 26,  "Platform", "Female", 50000));
//        testStreamMap(employeeList);
//        printEvenNumbersAndOddNumbers(intLists);
        testSampleStringStream("I love my india");
    }
    public static void printNthHighestSalary(List<Employee> employeeList , int num) {
        List<Double> testResult = employeeList.stream().map(Employee::getSalary).distinct().sorted(Collections.reverseOrder()).toList();
        System.out.println("testResult = " + testResult.get(num-1));
    }
    private static void testStreamMap(List<Employee> employeeList) {
        
        printNthHighestSalary(employeeList, 1);

        Map<String, Long> returnResult = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(returnResult);
        Map<String, Double> averagingResult = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averagingResult);
        
    }
    private static void printEvenNumbersAndOddNumbers(List<Integer> intList) {
    	String evenNumbers = intList.stream().filter((num) -> num % 2 == 0).map(String::valueOf).reduce((num1, num2) -> num1 + "," + num2).get(); //.collect(Collectors.toList());
    	String oddNumbers = intList.stream().filter((num) -> num % 2 != 0).map(String::valueOf).reduce((num1, num2) -> num1 + "," + num2).get();
    	System.out.println("Even : "+evenNumbers);
    	System.out.println("Odd : "+oddNumbers);
    }
    private static void testSampleStringStream(String sampleInputStr) {
    	String[] charArr = sampleInputStr.replace(" ", "").split("");
    	Map<Object, Long> output = Stream.of(charArr).collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    	System.out.println(output);
    	List<Entry<Object, Long>> uniqueList = output.entrySet().stream().filter(entry -> entry.getValue() == 1).collect(Collectors.toList());
    	System.out.println(uniqueList);
    }
}
