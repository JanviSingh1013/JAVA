class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> l1 = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i],i);
        }
    
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int value = map.get(list2[i]) + i;
                if(value < min){
                    min = value;
                    l1.clear();
                    l1.add(list2[i]);
                }else if(value == min){
                    l1.add(list2[i]);
                }
            }
        }
        return l1.toArray(new String[0]);
    }
}
