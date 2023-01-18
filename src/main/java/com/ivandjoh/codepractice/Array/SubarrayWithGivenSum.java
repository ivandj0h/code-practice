package com.ivandjoh.codepractice.Array;

import java.util.ArrayList;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-18

 * Given an unsorted array A of size N that contains only non-negative integers,
 * find a continuous sub-array which adds to a given number S and return the left and right
 * index(1-based indexing) of that subarray

 * In case of multiple subarrays, return the subarray indexes which comes first on moving from left to right.

 * Note:- Both the indexes in the array should be according to 1-based indexing. You have to return an arraylist
 * consisting of two elements left and right. In case no such subarray exists return an array
 * consisting of element -1.

 * Example:
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.

 * Input:
 * N = 10, S = 15
 * A[] = {1,2,3,4,5,6,7,8,9,10}
 * Output: 1 5
 * Explanation: The sum of elements
 * from 1st position to 5th position
 * is 15.

 * Your Task:
 * You don't need to read input or print anything.
 * The task is to complete the function subarraySum() which takes arr, N, and S as input parameters
 * and returns an arraylist containing the starting and ending positions of the first such occurring
 * subarray from the left where sum equals to S. The two indexes in the array should be according
 * to 1-based indexing. If no such subarray is found, return an array consisting of only one element that is -1.
 *
 */
public class SubarrayWithGivenSum {

    static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {

        int sum = 0;
        int start = 0;

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > s) {
                sum -= arr[start];
                start++;
            }

            if (sum == s && sum != 0) {
                result.add(start + 1);
                result.add(i + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }

    public static void executeSubarrayWithGivenSum() {
        int[] arr = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int s = 12;

        // Function call
        ArrayList<Integer> result = subArraySum(arr, n, s);
        System.out.println(result);
    }
}
