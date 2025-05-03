package com.practice.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        UserDetails ud1 = UserDetails.getInstance();
        System.out.println("ud1 = "+ud1.hashCode());
        UserDetails ud2 = UserDetails.getInstance();
        System.out.println("ud2 = "+ud2.hashCode());
    }
}
