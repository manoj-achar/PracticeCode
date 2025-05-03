package com.practice.leetcode;

import java.util.Arrays;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputs = new String[] {"babad", "cbbd"};
		LongestPalindromicSubString test = new LongestPalindromicSubString();
		Arrays.stream(inputs).forEach(input -> System.out.println(input + " : " +test.longestPalindrome(input)));

	}
	
	public String longestPalindrome(String s) {
		int maxPalindromeLength = 0;
		String palindromStr = "";
		
		for(int i = 0; i<s.length()-1; i++) {
			String tempStr = getMaxPalindromicSubStrLen(s, i, i);
			if(tempStr.length() > palindromStr.length()) {
				palindromStr = tempStr;
			}
			tempStr = getMaxPalindromicSubStrLen(s, i, i+1);
			if(tempStr.length() > palindromStr.length()) {
				palindromStr = tempStr;
			}
		}		
        return palindromStr;
    }
	
	public String getMaxPalindromicSubStrLen(String str, int leftIndex, int rightIndex) {
		while (leftIndex >= 0 && rightIndex < str.length() && str.charAt(leftIndex) == str.charAt(rightIndex)) {
			leftIndex--;
			rightIndex++;
		}
		return str.substring(leftIndex+1, rightIndex);
	}

}
