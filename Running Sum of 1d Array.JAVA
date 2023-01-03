class Solution {
    public int[] runningSum(int[] nums) {
        int [] rs=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                rs[i]=nums[i];
            }
            else{
                rs[i]=nums[i]+rs[i-1];
            }
        }
        return rs;
    }
}
