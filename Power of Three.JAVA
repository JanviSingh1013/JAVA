class Solution {
    public boolean isPowerOfThree(int n) {
       for(int i = 0; i < n; i++){
           double ans = Math.pow(3, i);
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
