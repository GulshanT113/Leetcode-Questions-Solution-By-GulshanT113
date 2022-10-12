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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode even = head.next;
        ListNode a = head;
        ListNode b = head.next;
        while(b != null && b.next != null){
            a.next = a.next.next;
            b.next = b.next.next;
            a = a.next;
            b = b.next;
        }
        a.next = even;
        return head;
    }
}