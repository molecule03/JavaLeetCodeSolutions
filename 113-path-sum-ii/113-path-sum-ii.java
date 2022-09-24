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
    List<List<Integer>> res;
    List<Integer> list;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        res = new ArrayList<>();
        list = new ArrayList<>();
        if(root == null) return res;
        
        dfs(root, targetSum);
        return res;
    }
    
    private void dfs(TreeNode root, int sum){
        
        if(root == null) return;
        
        
        list.add(root.val);
        if(root.val == sum && root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
            // return;
        }
        else{// if(root.left != null  root.right != null){
            dfs(root.left, sum-root.val);
            dfs(root.right, sum-root.val);
        }
        list.remove(list.size()-1);
    }
}