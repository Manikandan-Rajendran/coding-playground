#Problem: https://leetcode.com/problems/minimum-path-sum/

import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length ==0 || grid[0].length == 0)
            return 0; 
        if(grid.length ==1 && grid[0].length == 1)
            return grid[0][0];
        int[][] cache = new int[grid.length][grid[0].length];
        for(int[] arr : cache){
            Arrays.fill(arr, -1);
        }
        return helper(grid, 0, 0, grid.length-1, grid[0].length-1, cache);
    }
    
    public int helper(int[][] grid, int i, int j, int max_i, int max_j, int[][] cache) {
        if(cache[i][j]!=-1)
            return cache[i][j];
        if(i>=max_i && j >= max_j)
            return grid[max_i][max_j];
        int res = Integer.MAX_VALUE;
        if(i<max_i&&j<max_j){
            res = grid[i][j];
            res += Math.min(helper(grid, i+1, j, max_i, max_j, cache), helper(grid, i, j+1, max_i, max_j, cache));
        }
        else if(i<max_i && j>=max_j){
            res = grid[i][max_j];
            res += helper(grid, i+1, j, max_i, max_j, cache);
        }else if(j<max_j && i >= max_i){
            res = grid[max_i][j];
            res += helper(grid, i, j+1, max_i, max_j, cache);
        }
        cache[i][j]= res;
        return res;
        
    }
}
