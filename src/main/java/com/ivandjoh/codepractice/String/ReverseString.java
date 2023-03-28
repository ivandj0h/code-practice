package com.ivandjoh.codepractice.String;

public class ReverseString {


    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
        public static void executeReverseString (String args) {
        System.out.println("Reverse of " + args + " is " + reverseString(args));
    }

}
