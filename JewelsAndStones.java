class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(char ch: jewels.toCharArray()){
            set.add(ch);
        }
        for(char ch: stones.toCharArray()){
            if(set.contains(ch)){
                res++;
            }
        }
        return res;
    }
}
