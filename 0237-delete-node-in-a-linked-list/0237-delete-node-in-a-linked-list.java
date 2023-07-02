/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        ListNode last = node;
        ListNode next = node.next;
        while (next != null) {
            last = prev;
            int temp = prev.val;
            prev.val = next.val;
            next.val = temp;
            prev = prev.next;
            next = next.next;
        }
        last.next = null;
    }
}