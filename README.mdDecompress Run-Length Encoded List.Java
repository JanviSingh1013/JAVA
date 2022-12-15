# JAVAclass Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<Integer>(10);
        for(int i=0;i<nums.length;i=i+2){
            int freq=nums[i];
            int val=nums[i+1];
            while(freq!=0){
                arr.add(val);
                freq--;
            }
        }
        int[] ans = new int[arr.size()];
        for(int j = 0;j<arr.size();j++){
            ans[j] = arr.get(j);
        }
       
        return (ans);
    }
}
