class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int comp = Math.abs(i - map.get(nums[i]));
                if(comp <= k) {
                    return true;
                }
            }

            map.put(nums[i], i); // update to latest index
        }

        return false;
    }
}
