class Solution {
    public int distributeCandies(int[] candyType) {
        int type = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < candyType.length; i++){
            if(!set.contains(candyType[i])){
                set.add(candyType[i]);
                type = type + 1;
            }
        }

        return (candyType.length/2) <= type ? candyType.length/2 : type;
    }
}
