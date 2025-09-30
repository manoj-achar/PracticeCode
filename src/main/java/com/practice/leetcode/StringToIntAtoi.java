package com.practice.leetcode;

import java.util.Arrays;

public class StringToIntAtoi {

    public static void main(String[] args) {

        StringToIntAtoi stringToIntAtoi = new StringToIntAtoi();
        String[] inputs = {"43", " -042", "1337c0d3", "0-1", "-91283472332", "+1"};
        Arrays.stream(inputs).forEach(input -> {
            System.out.println("Input = "+input+" : output = "+stringToIntAtoi.myAtoi(input.trim()));
        });
    }

    public int myAtoi(String s) {
        long num = 0;
        s = s.trim();
        int signFlag = s.startsWith("-") ? -1 : 1;

        if(signFlag == -1 || s.startsWith("+")) {
            s = s.substring(1);
        }
        for(int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if(Character.isDigit(charAt)) {
                int digit = charAt - '0';
                num = num * 10 + digit;
                if(signFlag == 1 && num > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if(signFlag == -1 && (num * -1) < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return (int) num * signFlag;
    }
}
