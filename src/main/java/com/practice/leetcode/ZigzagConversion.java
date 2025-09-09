package com.practice.leetcode;

public class ZigzagConversion {

    public static void main(String[] args) {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String inputStr = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(zigzagConversion.convertNew(inputStr, numRows));
    }

    private String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
        int i = 0;
        while (i < len) {
            System.out.println("Loop starts with i = "+i);
            for (int idx = 0; idx < numRows && i < len; idx++) { // vertically down
                sb[idx].append(c[i++]);
                System.out.println("First for loop : idx = "+idx+" and i = "+i+" and sb["+idx+"] = "+sb[idx]);
            }
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) { // obliquely up
                sb[idx].append(c[i++]);
                System.out.println("Second for loop : idx = "+idx+" and i = "+i+" and sb["+idx+"] = "+sb[idx]);
            }
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

    private String convertNew(String s, int numRows) {
        char[] strChar = s.toCharArray();
        int strLength = strChar.length;
        StringBuilder[] strArr = new StringBuilder[numRows];
        int i  = 0;
        StringBuilder output = new StringBuilder();
        while(i < strLength) {
            for(int ind = 0; ind < numRows && i < strLength; ind++) {
                if(strArr[ind] == null) {
                    strArr[ind] = new StringBuilder();
                }
                strArr[ind].append(strChar[i++]);
            }
            for(int ind = numRows -2 ; ind >= 1 && i < strLength; ind--) {
                if(strArr[ind] == null) {
                    strArr[ind] = new StringBuilder();
                }
                strArr[ind].append(strChar[i++]);
            }

        }
        for (StringBuilder stringBuilder : strArr) {
            output.append(stringBuilder);
        }
        return output.toString();
    }
}
