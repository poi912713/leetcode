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
    int n = 0;
    public int kthSmallest(TreeNode root, int k) {
        int res = 0;
        res = helper(root, k);
        return res;
    }
    private int helper(TreeNode node, int k){
        int tmp=0;
        if(node == null){
            return 0;
        }
        tmp = helper(node.left, k);
        n++;
        if(k == n){
            return node.val;
        }
        tmp += helper(node.right, k);
        return tmp;
    }
}
