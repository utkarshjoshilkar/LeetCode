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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode nn = new TreeNode(val);
        TreeNode trav = root;
        if(root == null) {
            root = nn;
            return root;
        }
        while(true){
            if(trav.val>val){
                if(trav.left==null){trav.left = nn;break;}
                    
                trav = trav.left; 
            }
            else{
                if(trav.right==null){trav.right = nn;break;}
                    
                trav = trav.right;
            }
        }
        return root;
    }
}
