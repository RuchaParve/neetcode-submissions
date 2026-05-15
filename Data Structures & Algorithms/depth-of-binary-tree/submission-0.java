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
    public int maxDepth(TreeNode root) {
        int h = 0;
        if(root==null){
            return 0;
        }
        
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        h = Math.max(h,left_depth);
        h= Math.max(h,right_depth);

        return h+1;
    }
}
