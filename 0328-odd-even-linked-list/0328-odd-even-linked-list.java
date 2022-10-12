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
        int c = 1;
        ListNode dummy = head;
        while(dummy.next != null){
            dummy = dummy.next;
            c++;
        }
        int half = c/2;
        // System.out.println(half);
        ListNode end = dummy;
        ListNode start = head;
        ListNode holder = start;
        int i = 0;
        while(i < half){
            end.next = start.next;
            start.next = start.next.next;
            end.next.next = null;
            start = start.next;
            end = end.next;
            i++;
        }
        return holder;
    }
}