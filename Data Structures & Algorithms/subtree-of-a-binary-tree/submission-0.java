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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        getOrderString(root, s1);
        getOrderString(subRoot, s2);
        return s1.indexOf(s2.toString()) != -1;
    }
    public void getOrderString(TreeNode t, StringBuilder sb){
        if(t == null){
            sb.append('X');
            return;
        }
        sb.append(t.val);
        getOrderString(t.left, sb);
        getOrderString(t.right, sb);

    }
}
