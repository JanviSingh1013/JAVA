class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenhead = null;
        ListNode eventail = null;
        ListNode oddhead = null;
        ListNode oddtail = null;
        ListNode curr = head;
        int check = 1;
        while(curr != null){
            if(check % 2 == 0){
                if(evenhead == null){
                    evenhead = curr;
                    eventail = curr;
                    curr = curr.next;
                }
                else{
                    eventail.next = curr;
                    eventail = eventail.next;
                    curr = curr.next;
                }
            }
            else{
                if(oddhead == null){
                    oddhead = curr;
                    oddtail = curr;
                    curr = curr.next;
                }
                else{
                    oddtail.next = curr;
                    oddtail = oddtail.next;
                    curr = curr.next;
                }
            }
            check++;
        }
        if(oddhead == null){
            return evenhead;
        }

        if(evenhead == null){
            return oddhead;
        }
        eventail.next = null;
        oddtail.next = evenhead;
        return oddhead;
    }
}
