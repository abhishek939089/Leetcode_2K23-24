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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        rightView(root, list, 0);
        return list;
    }
    private void rightView(TreeNode node, List<Integer> list, int depth) {
        if(node == null) return;
        
        if(depth == list.size()) {
            list.add(node.val);
        }
        
        rightView(node.right, list, depth + 1);
        rightView(node.left, list, depth + 1);
    }
}