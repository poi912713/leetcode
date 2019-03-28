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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(res, root);
        return res;
    }
    void helper(List<Integer> res, TreeNode node){
        if(node==null)
            return;
        res.add(node.val);
        helper(res, node.left);
        helper(res, node.right);
    }
}
