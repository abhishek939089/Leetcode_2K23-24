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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode fast = temp, slow = temp;
        int len;
        for (len = 0; fast.next != null; len++) {
            fast = fast.next;
        }
        for (int j = len - (k % len); j > 0; j--) {
            slow = slow.next;
        }
        fast.next = temp.next;
        temp.next = slow.next;
        slow.next = null;

        return temp.next;
    }
}