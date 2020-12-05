#Problem: https://leetcode.com/problems/can-place-flowers/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean flag = true;
               if(i>0 && flowerbed[i-1]!=0){
                   flag=false;
               }
                if(i!=flowerbed.length-1){
                    if(flowerbed[i+1]!=0){
                        flag=false;
                    }
                }
                if(flag){
                    flowerbed[i]=1;
                    n--;
                }
            }
            if(n==0)
                return true;
        }
        if(n>0)
            return false;
        return true;
    }
}
