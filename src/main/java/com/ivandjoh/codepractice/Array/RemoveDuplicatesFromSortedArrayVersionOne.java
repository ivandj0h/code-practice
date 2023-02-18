package com.ivandjoh.codepractice.Array;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-02-18

 * Given that the array is sorted, all the duplicate elements will appear together.
 * We can solve the problem in O(n) time complexity by using two pointer pattern.
 * We’ll keep two pointers (indexes) -

 * One pointer i, to iterate over the array, and Another pointer j,
 * to keep track of the number of unique elements found so far.
 * This index will move only when we modify the array in-place to include a new non-duplicate element.
 */
public class RemoveDuplicatesFromSortedArrayVersionOne {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;

        /**
         * This index will be moving when we modify the array in-place to include an element
         * so that isn't repeated more than twice
         */
        int j = 0;
        for (int i=0; i < n; i++) {
            /**
             * if the current element is equal to the element at index i + 1, then skip
             * the current element, because it is repeated more than twice
             */
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }

    public static void executeRemoveDuplicates() {
        int[] nums = {1, 1, 1, 3, 5, 5, 7};
        int newLength = removeDuplicates(nums);

        System.out.println("Length of array after removing duplicates : " + newLength);
        System.out.println("The Array : ");

        for (int i=0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
