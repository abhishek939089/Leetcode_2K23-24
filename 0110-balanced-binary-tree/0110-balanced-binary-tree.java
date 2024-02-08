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
    private boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        dfsHeight(root);
        return ans; 
    }
    private int dfsHeight(TreeNode root) {
        if(root == null) return 0;
        int lh = dfsHeight(root.left);
        int rh = dfsHeight(root.right);
        
        if(Math.abs(lh - rh) > 1) ans = false;
        return 1 + Math.max(lh, rh);
    }
}