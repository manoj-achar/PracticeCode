package com.practice.leetcode;

public class FindHcf {

    public static void main(String[] args) {
        FindHcf findHcf = new FindHcf();
        System.out.println(findHcf.getHcf(70, 15));
    }

    public int getHcf(int num1, int num2) {
        while(num2 != 0) {
            int tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }
        return num1;
    }
}
