class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for (int i = 0; i < r1.length(); i++) {
            map.put(r1.charAt(i), 1);
        }

        for(int i = 0; i < r2.length(); i++){
            map.put(r2.charAt(i), 2);
        }

        for(int i = 0; i < r3.length(); i++){
            map.put(r3.charAt(i), 3);
        }

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            int row = map.get(Character.toLowerCase(word.charAt(0)));
            boolean check = true;
            for(int j = 1; j < word.length(); j++){
                char ch = Character.toLowerCase(word.charAt(j));
                if(map.get(ch) != row){
                    check = false;
                    break;
                }
            }
            if(check){
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
