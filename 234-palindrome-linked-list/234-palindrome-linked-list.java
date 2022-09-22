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
    public boolean isPalindrome(ListNode head) {
        ListNode rev = new ListNode(-1);
        ListNode temp = head, temp2 = rev;
        while(temp != null){
            temp2.next = new ListNode(temp.val);
            temp2 = temp2.next;
            temp = temp.next;
        }
        ListNode sh = rev.next;
        rev.next = null;
        sh = reverseList(sh);
        while (head != null) {
            if (head.val != sh.val) return false;
            sh = sh.next;
            head = head.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
		ListNode p = null, c = head, n = head;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}