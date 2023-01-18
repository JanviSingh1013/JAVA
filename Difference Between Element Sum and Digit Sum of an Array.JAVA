class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0,ds=0,as=0,rem;
        for(int i=0;i<nums.length;i++){
            es=es+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                ds=ds+nums[i];
            }
            else{
             while(nums[i]!=0){
                rem=nums[i]%10;
                ds=ds+rem;
                nums[i]=nums[i]/10;
            }
            }
        }
         as=es-ds;
        return as ;
    }
}
