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
    public boolean isBalanced(TreeNode root) {
       return DFS(root)[0]==1;
    }

    private int[] DFS(TreeNode root){
        if(root==null){
            return new int[]{1,0};
        }

        int [] left=DFS(root.left);
        int [] right=DFS(root.right);

        int height = Math.max(left[1],right[1])+1;
        boolean balnce = left[0]==1 && right[0]==1 && Math.abs(left[1]-right[1])<=1;

        return new int[]{balnce?1:0,height};
    }
}
