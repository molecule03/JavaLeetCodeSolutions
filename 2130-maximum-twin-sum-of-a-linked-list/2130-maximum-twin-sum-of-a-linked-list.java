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
        
        ListNode cur = head;
        int length = 0;
        while(cur != null){
            cur = cur.next;
            length++;
        }
        int half = length/2;
        
        Stack<Integer> st = new Stack<>();
       
        cur = head;
        int count = 0;
        while(count < half){
            st.push(cur.val);
            cur = cur.next;
            count++;
        }
        
        
        int res = Integer.MIN_VALUE;
        while(cur != null){
            int sum = st.pop()+cur.val;
            res = Math.max(res, sum);
            cur = cur.next;
        }
        
        
        return res;
    }
}