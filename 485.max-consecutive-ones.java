/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        /* longer version */
        // int max = 0, sum = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 1) {
        //         sum++;
        //     }
        //     else {
        //         sum = 0;
        //     }

        //     max = sum > max ? sum : max;
        // }

        // return max;

        /* concise version */
        int sum = 0, max = 0;
        for (int num : nums) {
            max = Math.max(max, sum = num == 1 ? sum + 1 : 0);
        }

        return max;
    }
}
// @lc code=end

