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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode res = new TreeNode(0);
        res = helper(nums, 0, nums.length-1);
        return res;
    }
    private TreeNode helper(int[] nums, int start, int end){
        if (start > end) { // Done
            return null;
        }
        int mid = (start+end)/2;
        System.out.print(mid);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid - 1);
        node.right = helper(nums, mid + 1, end);
        return node;
    }
}
