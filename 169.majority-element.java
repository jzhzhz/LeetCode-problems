import java.util.Arrays;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
    // dumb way
        // Arrays.sort(nums);
        // int max = nums[0], count = 1;
        // for (int i = 0; i < nums.length-1; ++i) {
        //     if (nums[i] == nums[i+1]) {
        //         count++;
        //         if (count > nums.length / 2) {
        //             max = nums[i];
        //         }
        //     } else {
        //         count = 1;
        //     }
        // }

        // return max;
    // sorting
    Arrays.sort(nums);
    return nums[nums.length/2];
    }
    // also have hashmap sol. and moore voting sol.
}
// @lc code=end

