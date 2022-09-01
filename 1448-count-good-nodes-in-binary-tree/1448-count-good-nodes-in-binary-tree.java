/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int count ;
    public int goodNodes(TreeNode root) {
        
        count = 0;
        
        countGood(root, Integer.MIN_VALUE);
        
        return count;
    }
    
    
    private void countGood(TreeNode root, int max){
        if(root == null) return;
        
        int cur = root.val;
        if(cur >= max){
            count++;
              max = cur;
        }
      
        
        countGood(root.left, max);
        countGood(root.right, max);
        
        return;
    }
}