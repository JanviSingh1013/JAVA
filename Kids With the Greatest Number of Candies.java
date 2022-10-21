class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
             int n=candies.length;
            List<Boolean> result = new ArrayList<Boolean>(n);
            int max=0;
        for( int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for( int i=0;i<candies.length;i++){
            int a=candies[i]+extraCandies;
            if(a>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
