import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3) throw new Error("array length is less than 3");
        //sort the array
        Arrays.sort(nums);
        int retVal=0,minDiff=Integer.MAX_VALUE;
        int j,k;
        for(int i=0;i<nums.length;i++) {
            // rm dup left index
            if(i!=0 && nums[i]==nums[i-1]) continue;
            // initialize middle and right index
            j=i+1;
            k=nums.length -1;
            // start middle and right index loop
            while(j<k) {
                int sum = nums[i] + nums[j] +nums[k];
                // bull's eye
                if(sum == target) return sum;
                else if(sum<target) j++;
                else k--;
                if(Math.abs(sum-target)<minDiff) {
                    minDiff=Math.abs(sum-target);
                    retVal=sum;
                }
            }
        }
        return retVal;

    }
}

