class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(i != j){
                if(s.charAt(i) == s.charAt(j)){
                    count = count + 1;
                    break;
                }
                }
            }
            if(count == 0){
                return i;
            }
        }
      return -1;
    }
}
