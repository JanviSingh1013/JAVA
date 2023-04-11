class Solution {
    public ListNode swapNodes(ListNode head, int k) {
         ListNode temp = head;
         ListNode slow = head;
         int i = 1;
         while(i < k){
             temp = temp.next;
             i++;
         }
         ListNode first = temp;
         while(temp.next != null){
             slow = slow.next;
             temp = temp.next;
         }
         int value = first.val;
        first.val = slow.val;
        slow.val = value;
         return head;
    }
    
}
