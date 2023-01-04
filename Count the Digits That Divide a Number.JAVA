class Solution {
    public int countDigits(int num) {
        int a,count=0;
        a=num;
        while(a!=0){
            int val=a%10;
            if(num%val==0){
               count=count+1;
            }
            a=a/10;
        }
        return count;
    }
}
