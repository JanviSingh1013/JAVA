class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            columnNumber = columnNumber - 1;
            int rem = columnNumber % 26;
            sb.append((char)('A' + rem));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}
