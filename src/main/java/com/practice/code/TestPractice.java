package com.practice.code;

import java.util.Arrays;

public class TestPractice {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        //System.out.println("JumpGame = " + jumpGame(nums));
        nums = new int[]{2,3,1,1,4};
        System.out.println("JumpGame = " + jumpGame(nums));
        System.out.println("Max jump = "+jumpGame2(nums));
//        checkRef(1L);
        //merge(new int[]{3, 5, 6, 8, 9, 0, 0, 0}, 5, new int[] {5, 9, 12}, 3);
    }

    private static boolean jumpGame(int[] nums) {
        for(int n : nums) {
            System.out.print(n + "\t");
        }
        System.out.println();
        /*int reach = 0;
        for(int i=0;i<nums.length;i++){
            if(reach<i){
                return false;
            }
            reach = Math.max(reach,i+nums[i]);
        }
        return true;*/
        int goal = nums.length-1;
        for(int i = nums.length-1; i>=0; i--) {
            if(i != goal) {
                if(nums[i] + i >= goal) {
                    goal = i;
                }
            }
        }
        return goal == 0 ? true : false;
    }
    public static int jumpGame2(int[] nums) {
        int totalJump = 0;
        int lastJumpIndex = 0;
        int maxCoverage = 0;
        int destination = nums.length-1;
        for(int index = 0; index < nums.length; index++) {
            maxCoverage = Math.max(maxCoverage, index + nums[index]);
            if(index == lastJumpIndex) {
                lastJumpIndex = maxCoverage;
                totalJump ++;
                if(maxCoverage >= destination) {
                    return totalJump;
                }
            }
        }
        return totalJump;
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp1 = Arrays.copyOf(nums1, m);
        boolean breakLoop = false;
        int num1COunter = 0;
        int num2COounter = 0;
        int temp1Counter = 0;
        while(!breakLoop) {
            if(temp1Counter == m) {
                nums1[num1COunter++] = nums2[num2COounter++];
            } else if(num2COounter == n) {
                nums1[num1COunter++] = temp1[temp1Counter++];
            } else {
                if (temp1[temp1Counter] <= nums2[num2COounter]) {
                    nums1[num1COunter++] = temp1[temp1Counter++];
                } else {
                    nums1[num1COunter++] = nums2[num2COounter++];
                }
            }
            if(num1COunter == (m + n)) {
                breakLoop = true;
            }
        }
        Arrays.stream(nums1).forEach(num -> System.out.print( num+"\t"));
    }
    private static void checkRef(Object ref) {
        System.out.println("ref.getClass() = " + ref.getClass());
    }
    public static int hIndex(int[] citations) {
        int hIndex = 0;
        for(int cit : citations) {
            if(cit >= 3) {
                hIndex++;
            }
        }
        return hIndex;
    }
}
