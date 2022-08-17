// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;
        while(start<end){
            int cur_max = Math.min(height[start], height[end]) * (end-start);
            if(height[start] < height[end])
                start++;
            else
                end--;
            if(cur_max > max)
                max = cur_max;
        }
        return max;
    }
}
