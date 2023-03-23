class Solution {
    public int addDigits(int num) {
        int ans = add(num);
       return ans;
    }
    int add(int num){
        int ans2 = 0;
        while(num!=0){
            int rem = num % 10;
            num = num / 10;
            ans2 = ans2 + rem;
        }
        if(ans2 > 9){
           ans2 = add(ans2);
       }
        return ans2;
    }
}
