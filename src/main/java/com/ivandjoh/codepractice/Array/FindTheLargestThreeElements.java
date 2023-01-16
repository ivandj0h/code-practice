package com.ivandjoh.codepractice.Array;

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

    static void printLargest(int arr[], int arr_size) {

        int i, first, second, third;

        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void executeFindTheLargestThreeElements() {
        int[] arr = {12, 13, 1, 10, 34, 1};
        int n = arr.length;
        printLargest(arr, n);
    }
}
