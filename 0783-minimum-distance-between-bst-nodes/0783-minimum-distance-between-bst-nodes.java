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
    ArrayList<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        int min=Integer.MAX_VALUE;
        inorder(root);
    for(int i=1;i<list.size();i++){
        int diff=list.get(i)-list.get(i-1);
        min=Math.min(min,diff);
    }
    return min;
    }
    void inorder(TreeNode root){
        if(root==null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}