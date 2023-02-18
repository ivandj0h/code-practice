package com.ivandjoh.codepractice.Array;

import java.util.Arrays;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-02-18

 * Given an array of unsorted integers a and a target,
 * find a triplet in the array whose sum is closest to the target value. Return the sum of the triplet.

 * Example:
 * Input: a = [-2, -4, 6, 3, 7], target = 2
 * Output: 1
 * Explanation: The triplet with sum closest to target is [-2, -4, 7], sum of the triplet is 1.

 * Input: a[] = [10, 2, 30, 49, 8], target = 50
 * Output: 48
 * Explanation: The triplet with sum closest to target is [10, 2, 30], sum of the triplet is 48.
 */
public class TripletSumClosestToTarget {
    private static int findTripletSumClosestToTarget(int[] a, int targetSum) {
        Arrays.sort(a);
        int smallestDiff = Integer.MAX_VALUE;

        for (int i=0; i < a.length-2; i++) {
            // doing skip duplicates
            if(i > 0 && a[i] == a[i-1]) {
                continue;
            }

            // fix one number
            int firstNum = a[i];

            // use Two-sum approach to get the other two numbers
            // such that the sum of all three numbers is closest to the target
            int left = i + 1;
            int right = a.length - 1;
            while(left < right) {
                int currentSum = firstNum + a[left] + a[right];
                int currentDiff = targetSum - currentSum;

                if(currentDiff == 0) {
                    return currentSum;
                }

                if (Math.abs(currentDiff) < Math.abs(smallestDiff)) {
                    smallestDiff = currentDiff;
                }

                if(currentDiff > 0) {
                    // TargetSum is greater than the Sum of triplet
                    // increment left pointer to increase the sum, so that the difference moves closer to 0
                    left++;
                } else {
                    // TargetSum is less than the Sum of triplet
                    // decrement right pointer to decrease the sum, so that the difference moves closer to 0
                    right--;
                }
            }
        }
        return targetSum - smallestDiff;
    }


    public static void executeTripleSumClosestToTarget(int[] a, int target) {
        System.out.printf("Triplet sum closest to target = %d%n", findTripletSumClosestToTarget(a, target));
    }
}
