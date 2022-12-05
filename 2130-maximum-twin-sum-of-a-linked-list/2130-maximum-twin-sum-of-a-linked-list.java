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
    public int pairSum(ListNode head) {
        
        
        ListNode left = head;
        ListNode right = head.next;
        int ans = Integer.MIN_VALUE;
        
        while(right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }
        // System.out.println(right.val+" "+left.val);
        
        ListNode prev = null;
        ListNode cur = left.next;
        // System.out.println(cur.val+" "+27);
        left.next = null;
        while(cur != right){
            ListNode next = cur.next;
            // System.out.print(cur.val+" ");
            cur.next = prev;
            // next.next = cur;
            
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        
        // System.out.println(head+" "+right);
        // while(head != null){
        //     System.out.print(head.val+" ");
        //     head = head.next;
        // }
        // System.out.println("");
        // while(right != null){
        //     System.out.print(right.val+" ");
        //     right = right.next;
        // }
        left = head;
        while(left != null && right != null){
            ans = Math.max(ans, left.val+right.val);
            left = left.next;
            right = right.next;
        }
        
        return ans;
    }
}