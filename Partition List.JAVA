/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new  ListNode();
         ListNode l1 = list1;
        ListNode list2 =  new  ListNode();
        ListNode l2 = list2;
        while(head != null){
            if(head.val < x){
                l1.next = head;
                l1 = l1.next;
            }
            else if(head.val >= x){
                l2.next = head;
                l2 = l2.next;
            }
            head = head.next;
        }
        l2.next = null;
        l1.next = list2.next;
        return list1.next;
    }
}
