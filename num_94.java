/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    List<Integer> res = new ArrayList<Integer>();
        
    public List<Integer> inorderTraversal(TreeNode root) {
        //dfs(root);
        dfsNonRecursive(root);
        return res;
    }
    
    private void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        res.add(node.val);
        dfs(node.right);
    }
    
    private void dfsNonRecursive(TreeNode root){
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || !st.empty()) {
            while (node != null) {
                st.push(node);
                node = node.left;
            }
            if (!st.empty()) {
                node = st.pop();
                res.add(node.val);
                node = node.right;
            }
        }
    }
}
