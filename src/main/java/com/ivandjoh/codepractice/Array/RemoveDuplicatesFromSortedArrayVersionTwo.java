package com.ivandjoh.codepractice.Array;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-02-18

 * Given a sorted array, remove the duplicates from the array in-place such that each element appears at most twice,
 * and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
 * extra memory.
 *
 * Example:
 * Input: a = [1, 1, 1, 3, 5, 7]
 * Output: 6
 */
public class RemoveDuplicatesFromSortedArrayVersionTwo {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;

        /**
         * This index will be moving when we modify the array in-place to include an element
         * so that isn't repeated more than twice
         */
        int j = 0;
        for (int i=0; i < n; i++) {
            /**
             * if the current element is equal to the element at index i + 2, then skip
             * the current element, because it is repeated more than twice
             */
            if (i < n - 2 && nums[i] == nums[i + 2]) {
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }

    public static void executeRemoveDuplicates() {
        int[] a = {1, 1, 1, 3, 5, 5, 7};
        int newLength = removeDuplicates(a);
        System.out.println("Length of array after removing duplicates : " + newLength);
        System.out.println("The Array : ");
        for (int i=0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
