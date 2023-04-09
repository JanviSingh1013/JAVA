class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;
        while(s <= l){
            int mid = (s + l) / 2;
            if(nums[mid] < target){
                s = mid + 1;
            }
            else if(nums[mid] > target){
                l = mid - 1;
            }
            else if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
