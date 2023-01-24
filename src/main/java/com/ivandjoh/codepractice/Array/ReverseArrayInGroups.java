package com.ivandjoh.codepractice.Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-24

 * Given an array arr[] of positive integers of size N.
 * Reverse every sub-array group of size K.

 * Note: If at any instance, there are no more sub-arrays of size
 * greater than or equal to K, then reverse the last subarray
 * (irrespective of its size). You shouldn't return any array,
 * modify the given array in-place.

 * Example :
 * Input:
 * N = 5, K = 3
 * arr[] = {1,2,3,4,5}
 * Output: 3 2 1 5 4
 * Explanation: First group consists of elements
 * 1, 2, 3. Second group consists of 4,5.

 * Example 2 :
 * Input:
 * N = 4, K = 3
 * arr[] = {5,6,8,9}
 * Output: 8 6 5 9

 * Your Task:
 * You don't need to read input or print anything.
 * The task is to complete the function reverseInGroups()
 * which takes the array, N and K as input parameters and modifies the array in-place.
 */
public class ReverseArrayInGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i+=k)
        {
            int l=i;
            int r=Math.min(i+k-1,n-1);
            while(l<r)
            {
                Collections.swap(arr, l, r);
                l++;
                r--;
            }
        }
    }

    public static void executeReverseArrayInGroups() {
        ReverseArrayInGroups reverseArrayInGroups = new ReverseArrayInGroups();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseArrayInGroups.reverseInGroups(arr, 5, 3);
        System.out.println(arr);
    }
}
