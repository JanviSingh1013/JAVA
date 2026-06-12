class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!map.containsKey(str)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }else{
                map.get(str).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
    }
}
