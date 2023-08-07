class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int l = letters.length - 1;
        int ans = 0;
        while(s <= l){
            int mid = s + (l - s) / 2;
            if(target == letters[mid]){
                s = mid + 1;
            }
            else if(target > letters[mid]){
                s = mid + 1;
            }
            else{
                l = mid - 1;
                ans = mid;
            }
        }
        return letters[ans];
    }
}
