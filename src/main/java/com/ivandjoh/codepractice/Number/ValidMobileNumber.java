package com.ivandjoh.codepractice.Number;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-14

 * Given a string M consisting of letters, digits and symbols,
 * the task is to convert the string to a valid mobile number
 * by removing all characters except the digits in the following format:

 * - Form a substring of 3 digits while the length of the remaining string is greater than 3.
 *   Enclose each substring with brackets “()” and separate them with “-“.
 * - If a valid mobile number cannot be obtained, i.e. if the string does not consist of 10 digits,
 *   then print -1. Otherwise, print the string obtained.

 * Input M = "628123967890"
 * Output: (62)-(812)-(396)-(7890)
 */
public class ValidMobileNumber {

    static void Validate(String M) {

        int len = M.length();
        String temp = "";

        for(int i=0; i<len; i++) {
            if(Character.isDigit(M.charAt(i))) {
                temp += M.charAt(i);
            }
        }
        int newLen = temp.length();
        if (newLen != 12) {
            System.out.println("is " + M + " is Valid? Answer is : Invalid\n");
            return;
        }
        String res = "";
        String x = temp.substring(0, 2);
        res += "(" + x + ")-";

        x = temp.substring(2, 5);
        res += "(" + x + ")-";

        x = temp.substring(5, 8);
        res += "(" + x + ")-";

        x = temp.substring(8, 12);
        res += "(" + x + ")";

        System.out.println(res + "\n");
    }

    public static void executeValidMobileNumber() {
        String M = "628123967890";
        Validate(M);
    }
}
