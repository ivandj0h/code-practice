package com.ivandjoh.codepractice.fancyNumber;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-14

 * Given a mobile number and some conditions for a fancy number,
 * find if the given number is fancy. A 10-digit mobile number is called fancy
 * if it satisfies any of the following three conditions.
 * - A single number occurs three consecutive times. Like 777.
 * Three consecutive digits are either in increasing or decreasing fashion. Like 456 or 987.
 * - A single digit occurs four or more times in the number. Like 9859009976 – here the digit 9
 * occurs 4 times.

 * Example:
 * Input:  9859009976
 * Output: yes
 * The given mobile number satisfies condition three given above.

 * input:  7609438921
 * output: no
 * The given three conditions satisfy
 */
public class FancyNumber {

    String mobileNumber = "7609438921";

    public static void executeFancyNumber() {
        FancyNumber fancyNumber = new FancyNumber();

        if (isFancyNumber(fancyNumber.mobileNumber)) {
            System.out.println("is " + fancyNumber.mobileNumber + " Fancy Number? The Answer is : FANCY");
        } else {
            System.out.println("is " + fancyNumber.mobileNumber + " Fancy Number? The Answer is : NOT FANCY");
        }

    }

    public static boolean isFancyNumber(String mobileNumber) {
        int incrementCount = 0;
        int decrementCount = 0;
        int consecutiveCount = 1;
        int[] countArray = new int[10];
        int prevDigit = -1;
        for (int i = 0; i < mobileNumber.length(); i++) {

            int digit = Integer.parseInt(String.valueOf(mobileNumber.charAt(i)));
            countArray[digit] += 1;

            if (countArray[digit] > 3)
                return true;

            if (prevDigit == digit)
                consecutiveCount += 1;

            else if (prevDigit == digit + 1) {
                incrementCount += 1;
                decrementCount = 0;
                consecutiveCount = 1;
            } else if (digit == prevDigit + 1) {
                decrementCount += 1;
                incrementCount = 0;
                consecutiveCount = 1;
            }

            if (consecutiveCount == 3)
                return true;

            if (incrementCount == 2 || decrementCount == 2)
                return true;

            prevDigit = digit;
        }
        return false;
    }
}
