import java.util.*;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int markIndex = Math.abs(nums[i]) - 1;
            if (nums[markIndex] > 0) {
                nums[markIndex] = -nums[markIndex];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i+1);
            }
        }

        return ret;
    }
}
// @lc code=end

