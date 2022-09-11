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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        ListNode start = new ListNode(0);
        ListNode ans = start;
        int leftover = 0;
        while(l1 != null && l2 != null){
            ans.next = new ListNode((l1.val + l2.val + leftover) % 10);
            if (l1.val + l2.val + leftover >= 10) {
                leftover = 1;
            } else {
                leftover = 0;
            }
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null && l2 == null) {
            ans.next = new ListNode((l1.val + leftover) % 10);
            if (l1.val + leftover >= 10) {
                leftover = 1;
            } else {
                leftover = 0;
            }
            ans = ans.next;
            l1 = l1.next;
        }
        while (l2 != null && l1 == null) {
            ans.next = new ListNode((l2.val + leftover) % 10);
            if (l2.val + leftover >= 10) {
                leftover = 1;
            } else {
                leftover = 0;
            }
            ans = ans.next;
            l2 = l2.next;
        }
        if (leftover > 0) {
            ans.next = new ListNode(leftover);
        }
        return start.next;
    }
}