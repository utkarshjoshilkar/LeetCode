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
    public List<Integer> inorder(TreeNode trav, List<Integer> tree) {
        if (trav == null)
            return tree;
        inorder(trav.left, tree);
        tree.add(trav.val);
        inorder(trav.right, tree);
        return tree;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<Integer>();
        if (root == null)
            return tree;
        TreeNode trav = root;
        inorder(trav, tree);
        return tree;
    }
}