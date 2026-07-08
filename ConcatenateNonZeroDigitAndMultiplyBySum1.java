class Solution {
    public long sumAndMultiply(int n) {
        int divisor = 1;
        int x = 0;
        int sum = 0;
        while(n / divisor >= 10){
            divisor *= 10;
        }
        while(divisor != 0){
            int digit = n / divisor;
            if(digit != 0){
                x = x * 10 + digit;
            }
            n = n % divisor;
            divisor /= 10;
        }

        int num = x;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return (long)x*sum;
    }
}
