/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */
import java.util.*;

class Solution {
    List<List<Integer>> out = new ArrayList<>();

    public void backtrack(List<Integer> comb, int[] candidates, int sum, int target, int index) {
        if (sum > target) 
            return;
        else if (sum == target && !out.contains(new ArrayList<>(comb))) {
            out.add(new ArrayList<>(comb));
        }
        else {
            for (int i = index+1; i < candidates.length; i++) {
                comb.add(candidates[i]);
                backtrack(comb, candidates, sum+candidates[i], target, i);
                comb.remove(comb.size()-1);

                if (i < candidates.length-1 && candidates[i] == candidates[i+1])
                    i++;
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(new ArrayList<>(), candidates, 0, target, -1);
        return out;        
    }
}

