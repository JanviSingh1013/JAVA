class Solution {
    public boolean isPalindrome(int x) {
        int palindrome=0;
        int a = x;
//        x=a;
        while(x>0){
            int rem=x%10;
            palindrome=palindrome*10+rem;
            x=x/10;
        }
       if(palindrome==a){
          return true;
      }
       return false;
        
    }
}
