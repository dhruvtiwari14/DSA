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
    public boolean isValidBST(TreeNode root) {
        return isbst(root,null,null);
    }
    boolean isbst(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;

        if(min!=null && root.val <= min.val) return false;
        if(max!=null && root.val >= max.val) return false;
     
        boolean isleftbst=isbst(root.left,min,root);
        boolean isrightbst=isbst(root.right,root,max);
        return isleftbst && isrightbst;
    }
}