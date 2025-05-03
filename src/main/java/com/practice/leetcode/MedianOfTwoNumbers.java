package com.practice.leetcode;

import java.util.Arrays;

public class MedianOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[] {1,2};
		int[] num2 = new int[] {3,4};
		double median = findMedianSortedArrays(num1, num2);
		System.out.println("Median = "+median);
			
//		System.out.println((float)5/2);
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedSort = new int[nums1.length + nums2.length];
        int index = 0;
        for(int num : nums1) {
            mergedSort[index++] = num;
        }
        for(int num : nums2) {
            mergedSort[index++] = num;
        }
        Arrays.sort(mergedSort);
        int mid1 = 0;
        int mid2 = 0;
        double median = 0;
        if(mergedSort.length % 2 == 0) {
            mid1 = mergedSort.length /2;
            mid2 = mid1 + 1;
            median = (double)(mergedSort[mid1 -1] + mergedSort[mid2 -1]) / 2;
        } else {
            mid1 = (int)(mergedSort.length/2);
            median = (mergedSort[mid1]);
        }
        return median;
    }

}
