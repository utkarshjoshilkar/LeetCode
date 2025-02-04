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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> warplist = new LinkedList<List<Integer>>();
        if(root== null) return warplist; // because it is no tree present 
        queue.offer(root); // insert root in queue without volatiling capacity 
        while(!queue.isEmpty()){
            int levelnum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0;i<levelnum;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            warplist.add(subList);
        }
        return warplist;
    }
}