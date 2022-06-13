/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL) return NULL;
        
        ListNode *dummy = new ListNode();
        dummy->next = head;
        
        ListNode *slow = dummy;
        ListNode *fast = dummy;
        
        while(fast != NULL && fast->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
            
            if(slow == fast){
                fast = dummy;
                while(fast != slow){
                    slow = slow->next;
                    fast = fast->next;
                 }
                 return fast;
            }    
        }

        
        return NULL;
    }
};