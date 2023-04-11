package com.ivandjoh.codepractice.Search;

public class BinaryGap {

    public static void executeBinaryGap() {
        int N = 529;
        System.out.println("Binary Gap: " + binaryGap(N));
    }

    private static int binaryGap(int N) {
        String binaryString = Integer.toString(N, 2);
        boolean start = false;
        int count = 0;
        int max = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            String c = binaryString.substring(i, i + 1);
            if(c.equals("1")){
                if(start) {
                    if(count > max) {
                        max = count;
                    }
                }
                start = true;
                count = 0;
            }
            if (c.equals("0") && start) {
                count++;
            }
        }
        return max;
    }
}
