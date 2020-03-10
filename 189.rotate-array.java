/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
    //dumb way, use O(n) extra space
        // if (nums.length == 1)
        //     return;
        
        // k %= nums.length;
        
        // int[] arr = new int[nums.length];
        // int i = 0, j = 0;
        // for ( ; i < k; ++i) {
        //     arr[i] = nums[nums.length-k+i];
        // }

        // for ( ; i < arr.length; ++i) {
        //     arr[i] = nums[j];
        //     ++j;
        // }
        
        // for (int m = 0; m < arr.length; m++) {
        //     nums[m] = arr[m];
        // }
    // another way: use reverse three times
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end

