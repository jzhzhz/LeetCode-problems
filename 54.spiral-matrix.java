import java.util.*;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        if (null == matrix || matrix.length < 1 || matrix[0].length < 1)
            return out;

        // (tr, tc) is the starting position for each new round
        // (br, bc) is the end
        // since each round adds 2n rows/cols of number
        // what remains would be always one row/col
        // so after adding last row/col it will finish
        int tr = 0, tc = 0, br = matrix.length-1, bc = matrix[0].length-1;
        while (tr <= br && tc <= bc) {
            // adding last row/col and finish
            // row
            if (tr == br) {
                for (int i = tc; i <= bc; i++)
                    out.add(matrix[tr][i]);
                break;
            }
            // col
            if (tc == bc) {
                for (int i = tr; i <= br; i++)
                    out.add(matrix[i][tc]);
                break;
            }
            // a new round
            int r = tr, c = tc;
            // left => right
            while (c < bc)
                out.add(matrix[r][c++]);
            // up => down
            while (r < br)
                out.add(matrix[r++][c]);
            // left <= right
            while (c > tc)
                out.add(matrix[r][c--]);
            // up <= down
            while (r > tr)
                out.add(matrix[r--][c]);
            tc++; 
            tr++;
            br--; 
            bc--;
        }

        return out;
    }
}

