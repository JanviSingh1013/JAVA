class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        int degree = 0;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(!first.containsKey(num)){
                first.put(num, i);
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            last.put(num, i);
            degree = Math.max(degree, freq.get(num));
        }

        int ans = nums.length;
        for(int key : freq.keySet()){
            if(freq.get(key) == degree){
                int length = last.get(key) - first.get(key) + 1;
                ans = Math.min(ans, length);
            }
        }
        return ans;
    }
}
