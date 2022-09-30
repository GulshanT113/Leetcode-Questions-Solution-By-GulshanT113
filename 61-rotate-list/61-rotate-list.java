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
    public int size(ListNode head){
        int c = 1;
        while(head.next != null){
            head = head.next;
            c++;
        }
        // System.out.println(c);
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int n = size(head);
        k %= n;
        if(k == 0) return head;
        int len = n-k;
        int idx = 1;
        ListNode temp = head;
        while(idx < len){
            temp = temp.next;
            idx++;
        }
        ListNode newList = temp.next;
        temp.next = null;
        ListNode temp2 = newList;
        while(temp2.next != null) temp2 = temp2.next;
        temp2.next = head;
        return newList;
    }
}