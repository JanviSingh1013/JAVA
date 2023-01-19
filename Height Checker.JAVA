class Solution {
    public int heightChecker(int[] heights) {
        int ans=0;
        int[]expected=new int[heights.length];
        for(int i=0;i<expected.length;i++){
            expected[i]=heights[i];
        }
        for(int i=0;i<expected.length;i++){
            Arrays.sort(expected);
        }
        for(int i=0;i<expected.length;i++){
            if(heights[i]!=expected[i]){
                ans++;
            }
        }
        return ans;
    }
}
