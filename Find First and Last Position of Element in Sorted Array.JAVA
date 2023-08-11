class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findleft(nums, target);
        int right = findright(nums, target);
        return new int [] {left, right};
    }
    private int findleft(int[] nums, int target){
       int s = 0;
       int l = nums.length - 1;
       int index = -1;
       while(s <= l){
           int mid = (s + l) / 2;
           if(nums[mid] == target){
               index = mid;
               l = mid - 1;
           }
           if(nums[mid] < target){
               s = mid + 1;
           }
           else{
               l = mid - 1;
           }
       }
       return index;
    }
    private int findright(int[] nums, int target){
       int s = 0;
       int l = nums.length - 1;
       int index = -1;
       while(s <= l){
           int mid = (s + l) / 2;
           if(nums[mid] == target){
               index = mid;
               s = mid + 1;
           }
           else if(nums[mid] < target){
               s = mid + 1;
           }
           else{
               l = mid - 1;
           }
       }
       return index;
    } 
}
