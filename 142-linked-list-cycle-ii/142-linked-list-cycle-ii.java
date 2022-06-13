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
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                flag = true;
                break;
            }    
        }

        if(flag){
            fast = dummy;
            while(fast != slow){
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
        
        return null;
    }
}