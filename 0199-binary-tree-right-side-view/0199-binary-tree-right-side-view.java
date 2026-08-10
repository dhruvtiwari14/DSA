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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
            Queue<TreeNode> q = new LinkedList<>();
            Queue<Integer> lvl = new LinkedList<>();
            q.offer(root);
            lvl.offer(0);
            while(!q.isEmpty()){
              TreeNode front = q.poll();
              int level = lvl.poll();

              map.put(level,front.val);

              if(front.left!=null){
                q.offer(front.left);
                lvl.offer(level+1);
              }
              if(front.right!=null){
                q.offer(front.right);
                lvl.offer(level+1);
              }
            }
            List<Integer> values = new ArrayList<>(map.values());
            return values;
    }
}