package com.practice.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSortingMrthods {

	public static void main(String[] args) {
		List<Integer> unsortedList = Arrays.asList(2, 6, 3, 8, 9, 17, 45, 7, 8, 9, 6, 45, 30);
//		sortList(unsortedList);
//		groupByCommonNum(unsortedList);
		int[] unsortedIntArr = new int[] {2, 6, 3, 8, 9, 17, 45, 7, 8, 9, 6, 45, 30};
//		sortIntArray(unsortedIntArr);
		
		System.err.println(Math.ceil(unsortedIntArr.length/2));
		
	}
	
	public static void sortList(List unsortedList) {
		System.out.println("Before : "+unsortedList);
		Collections.sort(unsortedList, Collections.reverseOrder());
		System.out.println("After : "+unsortedList);
	}
	
	public static void sortIntArray(int[] unsortedArr) {
		System.out.println("Before : ");
		Arrays.stream(unsortedArr).forEach(System.out::println);
		Arrays.sort(unsortedArr);
		Arrays.stream(unsortedArr).forEach(System.out::println);
	}
	public static void groupByCommonNum(List<Integer> inputList) {
		Map<Integer, Long> returnMap = inputList.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		System.out.println(returnMap);
	}

}
