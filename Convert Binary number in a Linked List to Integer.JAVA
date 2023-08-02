class Solution {
    public int getDecimalValue(ListNode head) {
        String s = "" ;
        while(head != null){
            int data = head.val;
            char x = (data ==1) ? '1': '0';
            s = s + x;
            head = head.next;
        }
        int ans = decimal(s);
        return ans;
    }
    int decimal(String s){
        int n = s.length();
        int dec = 0;
        int base = 1;
        for(int i = n - 1; i >= 0; i--){
            if(s.charAt(i) == '1'){
                dec = dec + base;
            }
            base = base * 2;
        }
        return dec;
    }
}
