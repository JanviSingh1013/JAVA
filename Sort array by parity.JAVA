class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                arr[j] = nums[i];
                j++;
            }
            else{
                arr[n - 1] = nums[i];
                n--;
            }
        }
        return arr;
    }
}
