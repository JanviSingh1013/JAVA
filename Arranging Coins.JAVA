class Solution {
    public int arrangeCoins(int n) {
        long s = 0;
        long l = n;
        while(s <= l){
            long mid = (s + l) / 2;
            
            if((mid * (mid + 1) / 2) <= n){
                s = mid + 1;
            }
            else{
                l = mid - 1;
            }
        }
       
        return (int)s - 1;
    }
}
