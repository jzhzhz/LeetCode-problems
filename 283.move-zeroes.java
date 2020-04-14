/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int insertIndex = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex++] = num;
            }
        }

        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
    }
}
// @lc code=end

