class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i = 0; i < n; i++){
           double ans = Math.pow(4, i);
           if(ans == n){
               return true;
           }
           else if(ans > n){
               return false;
           }
       }
       return false;
    }
}
