package org.example.leetcode.double_pointer;

/**
 * 是否有环
 */
public class Leetcode6_LinkedListCycle {

    class ListNode {
        private int data;
        private ListNode next;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode l1 = head, l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null) {
            if (l1 == l2) {
                return true;
            }
            l1 = l1.next;
            //走两步
            l2 = l2.next.next;
        }
        return false;
    }
}
