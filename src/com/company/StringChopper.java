package com.company;

public class StringChopper {


    public static String chopOff(String longString){
        // chops off the last 4 characters and returns the results
        int x = longString.length();
        return longString.substring(0, x-4);
    }

    public static void main(String[] args){
        System.out.println(chopOff("ladybug"));
    }
}
