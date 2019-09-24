/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int lastTrue = n-1;
        // from back to start
        for (int i = n-2; i >= 0; i--) {
            if (i+nums[i] >= n-1 || i+nums[i] >= lastTrue )
                lastTrue = i;
        }

        return lastTrue == 0;
    }
}

