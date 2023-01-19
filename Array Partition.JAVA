class Solution {
    public int arrayPairSum(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            if(nums[i]<=nums[i+1]){
                ans=ans+nums[i];
            }
            else{
                ans=ans+nums[i+1];
            }
        }
        return ans;
    }
}
