
/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int l = 0, r = nums.length-1, m, m2, sum;
        List<List<Integer>> out = new ArrayList<>();
        // deadend
        if (nums.length < 3) return out;
        Arrays.sort(nums);

        // loop of left
        while (l < nums.length-3) {
            // rm dup left 
            if (l > 0)
                while (l < nums.length-3 && nums[l-1] == nums[l])
                    l++;
            // re-initialize right and middle
            r = nums.length-1;
            m = l+1;
            // loop of middle
            for (m=l+1; m < r; m++) {
                // rm dup middle
                if (m > l+1)
                    while (m < nums.length-2 && nums[m-1] == nums[m])
                        m++;

                // re-initialize right and middle2
                r = nums.length-1;
                m2 = m+1;

                while (m2 < r) {
                    sum = nums[l] + nums[m] + nums[m2] + nums[r];
                    if (sum == target) {
                        out.add(Arrays.asList(nums[l], nums[m], nums[m2], nums[r]));
                        m2++;
                        r--;

                        while (m2 < r && nums[m2] == nums[m2-1])
                            m2++;
                        while (r > m2 && nums[r] == nums[r+1])
                            r--;
                    } else if (sum < target) {
                        m2++;
                    } else {
                        r--;
                    }
                }
            }

            l++;
        }

        return out;
    }
}


