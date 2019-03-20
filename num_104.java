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

    public int maxDepth(TreeNode root) {
        int res = dfs(root);
        return res;
    }
    
    int dfs(TreeNode node){
        if(node == null)
        {
           return 0;  
        }
        int leftDep = dfs(node.left);
        int rightDep = dfs(node.right);
        return Math.max(leftDep,rightDep) + 1 ;
    }
    
}
