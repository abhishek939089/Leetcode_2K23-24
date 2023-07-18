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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        if(left == right) {
            return head;
        }
        ListNode ans = new ListNode(1);
        ListNode beforeM = ans;
        beforeM.next = head;
        ListNode current = head;
        ListNode After = head.next;
        for (int i = 1; i < left; i++) {
            beforeM = current;
            current = current.next;
            After = After.next;
        }
        ListNode before = beforeM;
        for (int j = left; j < right; j++) {
            current.next = before;
            before = current;
            current = After;
            After = After.next;
        }
        current.next = before;
        beforeM.next.next = After;
        beforeM.next = current;
        return ans.next;
    }
}