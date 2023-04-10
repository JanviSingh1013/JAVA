class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode l1 = list1;
       ListNode l2 = list2;
       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;
       while(l1 != null && l2 != null){
           if(l1.val <= l2.val){
               curr.next = l1;
               l1 = l1.next;
               curr = curr.next;
           }
           else{
               curr.next = l2;
               l2 = l2.next;
               curr = curr.next;
           }
       }
       if(l1 != null){
           curr.next = l1;
       }
       else if(l2 != null){
           curr.next = l2;
       }
       return dummy.next;
    }
}
