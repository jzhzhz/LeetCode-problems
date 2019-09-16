/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */
class Solution {
    public int binarySearch(int[] nums, int from, int to, int target) {
        while(from <= to) {
            int mid = (from+to)/2;
            if (nums[mid] == target)
                return mid;
            else if (isInLeft(nums[from], nums[to]
                , nums[mid], target)) {
                to = mid-1;
                binarySearch(nums, from, to, target);
            } else {
                from = mid+1;
                binarySearch(nums, from, to, target);
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int from = 0, to = nums.length-1;
        return binarySearch(nums, from, to, target);
    }

    public boolean isInLeft(int from, int to, int mid , int target) {
        if (from <= mid) {
            return (from <= target && target <= mid) ? true : false;
        } else {
            return (mid <= target && target <= to) ? false : true;
        }
    }
}

