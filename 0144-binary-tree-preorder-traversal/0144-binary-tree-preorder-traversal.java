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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return preorderhelper(root, list);
    }
    
    private List<Integer> preorderhelper(TreeNode root, List<Integer> list) {
        if(root==null) {
            return list;
        }
        list.add(root.val);
        preorderhelper(root.left, list);
        preorderhelper(root.right, list);
        
        return list;
    }
}