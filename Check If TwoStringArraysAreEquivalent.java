class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){ 
    
        String Word1 = "",Word2="";
        for(int i = 0;i<word1.length;i++){
            Word1 = Word1 + word1[i];
        }
        
        for(int i = 0;i<word2.length;i++){
            Word2 = Word2 + word2[i];
        }
        if(Word1.equals(Word2)){
            return true;
        }
        return false;
    }
}
