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
    int postidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx=postorder.length-1;
        return help(inorder,postorder,0,postorder.length-1);

    }
    TreeNode help(int[] inorder, int[] postorder,int left,int right){
        if(left>right) return null;

        TreeNode root = new TreeNode(postorder[postidx--]);
        
        int inIdx=search(inorder,root.val,left,right);
        //postidx-=1;

        root.right=help(inorder,postorder,inIdx+1,right);
        root.left=help(inorder,postorder,left,inIdx-1);
        return root;
    }
    int search(int inorder[],int val,int left,int right){
        for(int i=left;i<=right;i++){
           if(inorder[i]==val) return i;
        }
        return -1;
    }
}
