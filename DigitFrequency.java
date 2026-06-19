class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            if(map.containsKey(rem)){
                map.put(rem,map.get(rem) + 1);
            }else{
                map.put(rem,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum += entry.getKey()*entry.getValue();
        }
        return sum;
    }
}
