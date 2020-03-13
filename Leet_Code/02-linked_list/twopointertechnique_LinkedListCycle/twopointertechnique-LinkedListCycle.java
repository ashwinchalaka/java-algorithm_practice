/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        else if (head == head.next)
            return true;
        else if (head.next == null)
            return false;
        else {
            ListNode slow1 = head;
            ListNode fast1 = head.next;
            int cycleCount = 0;

            while (cycleCount < 10000) {
                slow1 = slow1.next;
                
                if (fast1.next == null || fast1.next.next == null)
                    return false;
                else
                    fast1 = fast1.next.next;

                if (slow1 == fast1)
                    return true;

                cycleCount++;
            }
        }
        
        return false;
    }
}