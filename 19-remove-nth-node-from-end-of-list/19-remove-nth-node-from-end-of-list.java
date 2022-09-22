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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head), s = dummy, f = dummy;
        for(int i = 0; i < n; i++) f = f.next; // this loop for maintain the gap between slow and fast iterator.
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }
}