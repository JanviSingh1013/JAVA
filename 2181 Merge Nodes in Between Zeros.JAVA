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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode curr = head.next;
        int sum = 0;
        while(curr != null){
            while(curr != null && curr.val != 0){
               sum = sum + curr.val;
               curr = curr.next;
            }
            if(curr != null){
                curr = curr.next;
            }   
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
             return dummy.next;
        }
       
    }
