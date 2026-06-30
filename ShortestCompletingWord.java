class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if(map1.containsKey(ch)){
                    map1.put(ch, map1.get(ch) + 1);
                }else
                {
                    map1.put(ch, 1);
                }
            }
        }

        String ans = "";

        for (String word : words) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (char ch : word.toCharArray()) {
                if(map2.containsKey(ch)){
                    map2.put(ch, map2.get(ch) + 1);
                }else
                {
                    map2.put(ch, 1);
                }
            }
            boolean possible = true;

            for (char ch : map1.keySet()) {
                if (map2.getOrDefault(ch, 0) < map1.get(ch)) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                if (ans.equals("") || word.length() < ans.length()) {
                    ans = word;
                }
            }
        }

        return ans;
    }
}
