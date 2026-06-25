class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == target){
                    temp++;
                }
                int length = j - i + 1;
                if(temp > (length/2)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
