/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int smallPivot = -1;
        int swapIndex = 0;
        
        // find the first break-point of descending order
        // from right to left
        // index before the descending order is to be swapped
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i-1] < nums[i]) {
                smallPivot = i-1;
                break;
            }
        }

        // no change, simply swapping everything
        if (smallPivot == -1) {
            swapSort(nums, 0, nums.length-1);
            return;
        }

        // find the first that is larger than the pivot value
        for (int i = nums.length-1; i > smallPivot; i--) {
            if (nums[i] > nums[smallPivot]) {
                swapIndex = i;
                break;
            }
        }

        // swap and sort
        swap(nums, smallPivot, swapIndex);
        swapSort(nums, smallPivot+1, nums.length-1);
    }

    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void swapSort(int nums[], int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}

