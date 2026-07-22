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
        int preidx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder,inorder,preidx,0,inorder.length-1);
    }
    TreeNode help(int[] preorder, int[] inorder,int idx,int left,int right){
        if(left>right) return null;

        TreeNode root = new TreeNode(preorder[preidx++]);
        int inIdx=search(inorder,root.val,left,right);//inorder index
        
        root.left=help(preorder,inorder,preidx,left,inIdx-1);
        root.right=help(preorder,inorder,preidx,inIdx+1,right);

        return root;
    }
    int search(int inorder[],int val,int left,int right){
        for(int i=left;i<=right;i++){
           if(inorder[i]==val) return i;
        }
        return -1;
    }
}