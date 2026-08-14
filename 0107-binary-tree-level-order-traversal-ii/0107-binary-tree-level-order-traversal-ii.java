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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        List<Integer> row = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode front = q.poll();

            if(front==null){
               list.add(row);
               row = new ArrayList<>();
               if(!q.isEmpty()) q.offer(null);
            }
            if(front!=null){
            row.add(front.val);

            if(front.left!=null){
                q.offer(front.left);
            }
            if(front.right!=null){
                q.offer(front.right);
            }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            ans.add(list.get(i));
        }
        return ans;
    }
}