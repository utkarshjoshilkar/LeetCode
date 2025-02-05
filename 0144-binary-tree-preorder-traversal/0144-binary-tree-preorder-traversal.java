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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode trav = root;
        stack.push(root);

        if (root == null)
            return list;

        while (!stack.isEmpty()) {
            list.add(trav.val);
            if (trav.right != null)
                stack.push(trav.right);
            if (trav.left != null)
                stack.push(trav.left);
            if (!stack.empty())
                trav = stack.pop();
        }
        return list;
    }
}
