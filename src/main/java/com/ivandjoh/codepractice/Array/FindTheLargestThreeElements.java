package com.ivandjoh.codepractice.Array;

import java.util.Arrays;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-16

 * Given an array with all distinct elements,
 * find the largest three elements.
 * Expected time complexity is O(n) and extra space is O(1).

 * Example:
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
 * Output: 90, 50, 23
 */
public class FindTheLargestThreeElements {

    static void printLargest(int arr[]) {

        Arrays.sort(arr); // It uses Tuned Quicksort with
        // avg. case Time complexity = O(nLogn)
        int n = arr.length;
        int check = 0, count = 1;

        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            }
            else
                break;
        }
    }

    public static void executeFindTheLargestThreeElements() {
        FindTheLargestThreeElements obj = new FindTheLargestThreeElements();
        int[] arr = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 };
        obj.printLargest(arr);
    }
}
