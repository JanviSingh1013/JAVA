class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode check = head;
        ListNode temp = head;
        int length = 1;
        while(check.next != null){
            check = check.next;
            length ++;
        }
        k = k % length;
        if(k == 0){
            return head;
        }
        for(int i = 0; i < length - k - 1; i++){
            temp =temp.next;
        }
        ListNode repl = temp.next;
        temp.next = null;
        ListNode repln = repl;
        while(repln.next != null){
            repln = repln.next;
        }
        repln.next = head;
        ListNode newhead = repl;
        return newhead;
    }
}
