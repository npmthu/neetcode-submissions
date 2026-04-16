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
    public int getHeight(TreeNode n){
        if(n == null) return -1;

        return Math.max(getHeight(n.left), getHeight(n.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int diff =  Math.abs(getHeight(root.left) - getHeight(root.right));
        if(diff > 1){
            return false;
        } else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}
