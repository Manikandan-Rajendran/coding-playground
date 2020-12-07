#Problem: https://leetcode.com/problems/spiral-matrix-ii/
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int rowStart =0;
        int rowEnd = n-1;
        int columnStart =0;
        int columnEnd = n-1;
        int value =1;
       
        while(rowStart<=rowEnd && columnStart <= columnEnd){
            for(int i = columnStart;i<=columnEnd;i++){
                result[rowStart][i] = value;
                value++;
            }
            rowStart++;
           
            for(int i = rowStart;i<=rowEnd;i++){
                result[i][columnEnd] = value;
                value++;
            }
            columnEnd--;
            if(rowStart<=rowEnd){
            for(int i = columnEnd;i>=columnStart;i--){
                result[rowEnd][i] = value;
                value++;
            }
            }
            rowEnd--;
            if( columnStart <= columnEnd){
            for(int i = rowEnd;i>=rowStart;i--){
                result[i][columnStart] = value;
                value++;
            }}
            columnStart++;
           
        }
        return result;
    }
}
