package com.practice.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        // x in range [-2^31, 2^31 - 1]
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println("output = "+reverseInteger.reverse(-2147483412));
    }

    public int reverse(int x) {
        int num = 0;
        while(x != 0) {
            int rem = x % 10;
            x = x / 10;

            if(num > Integer.MAX_VALUE /10 || (num == Integer.MAX_VALUE /10 && rem > 7)) {
                return 0;
            }
            if(num < Integer.MIN_VALUE /10 || (num == Integer.MIN_VALUE /10 && rem < -8)) {
                return 0;
            }
            num = (num * 10) + rem;
        }
        return num;
    }
}
