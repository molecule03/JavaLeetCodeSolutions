/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return res;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                Node cur = q.poll();
                
                for(Node child : cur.children){
                    q.offer(child);
                }
                list.add(cur.val);
            }
            res.add(list);
        }
        
        return res;
    }
}