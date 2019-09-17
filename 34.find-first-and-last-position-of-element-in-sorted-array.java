/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */
class Solution {
    public int binarySearch(int[] nums, int lo, int hi, int target) {
        // avoid overflow
        int mid = lo + (hi-lo)/2;
        // search the target
        while (lo <= hi) {
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                lo = mid+1;
                return binarySearch(nums, lo, hi, target);
            } else {
                hi = mid-1;
                return binarySearch(nums, lo, hi, target);
            }
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {

        int index = binarySearch(nums, 0, nums.length-1, target);
        
        if (index == -1)
            return new int[] {-1,-1};
        
        int j = index, i = index;
        
        while (i > 0 && nums[i] == nums[i-1]) i--;
        while (j < nums.length-1 && nums[j] == nums[j+1]) j++;
        
        return new int[] {i, j};
    }
}

