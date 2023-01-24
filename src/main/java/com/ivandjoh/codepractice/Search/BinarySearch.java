package com.ivandjoh.codepractice.Search;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-24

 * Given a sorted array of size N and an integer K,
 * find the position at which K is present in the array using binary search.

 * Example 1:
 * Input:
 * N = 5
 * arr[] = {1 2 3 4 5}
 * K = 4
 * Output: 3
 * Explanation: 4 appears at index 3.

 * Example 2:
 * Input:
 * N = 5
 * arr[] = {11 22 33 44 55}
 * K = 445
 * Output: -1
 * Explanation: 445 is not present.

 * Your Task:
 * You don't need to read input or print anything.
 * Complete the function binary search() which takes arr[],
 * N and K as input parameters and returns the index of K in the array.
 * If K is not present in the array, return -1.
 */

public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        // code here
        for (int i=0; i<n; i++){
            if (arr[i]==k) {
                return i;
            }
        }
        return -1;
    }

    public static void executeBinarySearch() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 4;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarysearch(arr, n, k));
    }
}
