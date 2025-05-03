package com.practice.exception;

import org.apache.commons.lang3.math.NumberUtils;

import java.sql.ResultSet;

public class TestExceptionHandler {
    public static void main(String[] args) {
        System.out.println("(int)NumberUtils.toFloat(\"8.0\") = " + (int)NumberUtils.toFloat("8.0"));
    }
}
