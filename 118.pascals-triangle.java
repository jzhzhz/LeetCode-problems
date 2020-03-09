import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> triangle = new ArrayList<>(numRows);
        List<Integer> temp = new ArrayList<Integer>(1);
        temp.add(1);
        triangle.add(temp);

        for (int i = 1; i < numRows; i++) {
            List<Integer> up = triangle.get(i-1);
            temp = new ArrayList<Integer>(i+1);

            temp.add(up.get(0));
            for (int j = 1; j < up.size(); j++) {
                temp.add(up.get(j-1) + up.get(j));
            }
            temp.add(up.get(up.size()-1));
            
            triangle.add(temp);
        }
        return triangle;
    }
}
// @lc code=end

