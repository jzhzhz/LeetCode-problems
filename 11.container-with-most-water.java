/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */
class Solution {
    public int maxArea(int[] height) {
        if (height.length < 2)
            return 0;

        int left = 0, right = height.length-1;
        int max = 0;
        while(left < right) {
            int temp = 0;
            // here Math.min() can be used instead
            if (height[left] < height[right]) {
                temp = height[left]*(right-left);
                max = (temp > max) ? temp : max;
                left++;
            }
            else {
                temp = height[right]*(right-left);
                max = (temp > max) ? temp : max;
                right--;
            }
        }
        return max;
    }
}

