package com.ivandjoh.codepractice.Array;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-18

 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

 * Example:
 * Input:
 * N = 5
 * arr[]= {0 2 1 2 0}
 * Output:
 * 0 0 1 2 2
 * Explanation:
 * 0s 1s and 2s are segregated
 * into ascending order.

 * Input:
 * N = 3
 * arr[] = {0 1 0}
 * Output:
 * 0 0 1
 * Explanation:
 * 0s 1s and 2s are segregated
 * into ascending order.

 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function sort012()
 * that takes an array arr and N as input parameters and sorts the array in-place.
 */
public class SortAnArrayOf0s1s2s {

    public static void sortArray(int[] a, int n) {

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }

    public static void executeSortAnArrayOf0s1s2s() {
        int[] arr = { 0, 2, 1, 2, 0 };
        int n = arr.length;

        // Function call
        sortArray(arr, n);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
