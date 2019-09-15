import java.util.Arrays;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l = 0, r = nums.length-1, m;
        List<List<Integer>> out = new ArrayList<>();
        // deadend
        if (nums.length < 3) return out;
        Arrays.sort(nums);

        while (l < nums.length-2) {
            if (nums[l] > 0) break;
            if (l > 0)
                while (l < nums.length-2 && nums[l-1] == nums[l])
                    l++;
                
            r = nums.length - 1;
            m = l+1;

            while(m < r) {
                if (nums[l] + nums[m] + nums[r] == 0) {
                    out.add(Arrays.asList(nums[l], nums[m], nums[r]));
                    m++;
                    r--;

                    while(m < r && nums[m] == nums[m-1])
                        m++;
                    while(r > m && nums[r] == nums[r+1])
                        r--;
                } else if (nums[l] + nums[m] + nums[r] < 0) {
                    m++;
                } else {
                    r--;
                }
            }

            l++;
        }

        return out;
    }
}

