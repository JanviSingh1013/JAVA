class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        int c = nums[0];
        int d = nums[1];
        int ans = (a * b) - (c * d);
        return ans;
    }
}
