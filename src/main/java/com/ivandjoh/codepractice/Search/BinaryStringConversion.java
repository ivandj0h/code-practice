package com.ivandjoh.codepractice.Search;

public class BinaryStringConversion {

    public static void executeBinaryStringConversion() {
        int N = 9;
        binaryStringConversion(N);
    }

    private static int binaryStringConversion(int N) {
        String binaryString = Integer.toBinaryString(N);
        System.out.println("Binary String: " + binaryString);
        return 0;
    }
}
