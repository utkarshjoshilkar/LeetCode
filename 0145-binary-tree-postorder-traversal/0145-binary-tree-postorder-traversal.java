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

    public List<Integer> postorder(TreeNode trav, List<Integer> tree) {
        if (trav == null)
            return tree;
        postorder(trav.left, tree);
        postorder(trav.right, tree);
        tree.add(trav.val);
        return tree;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<Integer>();
        if (root == null)
            return tree;
        TreeNode trav = root;
        postorder(trav, tree);
        return tree;
    }
}