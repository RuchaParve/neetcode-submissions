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
    public int kthSmallest(TreeNode root, int k) {
    //     List<Integer> res = new ArrayList<>();
    //     InorderTraversal(root,res);
    //     return res.get(k-1);
    // }

    // public void InorderTraversal(TreeNode root,List<Integer> res){
    //     if(root==null){
    //         return;
    //     }
        
    //     InorderTraversal(root.left,res);
    //     res.add(root.val);
    //     InorderTraversal(root.right,res);


        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(!stack.isEmpty() || curr!=null){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            curr = stack.pop();
            k--;
            if(k==0){
                return curr.val;
            }
            curr=curr.right;
        }

        return -1;
    }

}
