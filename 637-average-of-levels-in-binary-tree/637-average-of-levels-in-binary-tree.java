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
    public List<Double> averageOfLevels(TreeNode root) {
        
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<n; i++){
                TreeNode cur = q.poll();
                
                if(cur != null && cur.left != null) q.offer(cur.left);
                if(cur != null && cur.right != null) q.offer(cur.right);
                
                list.add(cur.val);
                
            }
            // System.out.println(list);
            res.add(list);
        }
        
        List<Double> ans = new ArrayList<>();
        for(List<Integer> now : res){
            double sum = 0;
            for(int i : now){
                sum+=i;
            }
            ans.add(sum/now.size());
        }
        
        return ans;
        
    }
}