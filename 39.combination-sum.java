/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

import java.util.*;

class Solution {
    List<List<Integer>> out = new ArrayList<>();

    public void backtrack(List<Integer> comb, int[] candidates, int sum, int target, int index) {
        if (sum > target) 
            return;
        else if (sum == target)
            out.add(new ArrayList<>(comb));
        else {
            for (int i = index; i < candidates.length; i++) {
                comb.add(candidates[i]);
                backtrack(comb, candidates, sum+candidates[i], target, i);
                comb.remove(comb.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<>(), candidates, 0, target, 0);
        return out;
    }
}

