/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> preorder(TreeNode trav, List<Integer> tree) {
        if (trav == null)
            return tree;
        tree.add(trav.val);
        preorder(trav.left, tree);
        preorder(trav.right, tree);
        return tree;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<Integer>();
        if (root == null)
            return tree;
        TreeNode trav = root;
        preorder(trav, tree);
        return tree;
    }
}
