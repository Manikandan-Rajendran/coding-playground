// Problem: https://leetcode.com/problems/climbing-stairs/
class Solution {
    public int climbStairs(int n) {
        return helper(n, new int[n+1]);
    }
    public int helper(int n, int[] cache){
        if(n<=2){
            return n;
        }
        if(cache[n]!=0)
            return cache[n];
        cache[n] = helper(n-1, cache) + helper(n-2, cache);
        return cache[n];
    }
}