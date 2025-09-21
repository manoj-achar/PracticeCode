package com.practice.leetcode;

import java.util.Arrays;

public class MaximizedSum {

    public static void main(String[] args) {
        int[] input = {6,2,6,5,1,2};
        MaximizedSum maximizedSum = new MaximizedSum();
        System.out.println(maximizedSum.arrayPairSum(input));
    }

    public int arrayPairSum(int[] nums) {
        int maximizedSum = 0;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i+=2) {
            maximizedSum += nums[i];
        }
        return maximizedSum;
    }
}
