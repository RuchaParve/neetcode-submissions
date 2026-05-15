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
    int count=0;
    public int goodNodes(TreeNode root) {
       helping(root.val,root);
       return count; 
    }
    public void helping(int val,TreeNode root){
        if(root==null){
            return;
        }
        if(root.val>=val){
            count++;
        }
        val=Math.max(root.val,val);
        helping(val,root.left);
        helping(val,root.right);
    }
}
