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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> mainlist=new ArrayList<>();
    if (root == null) return mainlist;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
        TreeNode front=q.poll();
        if(front==null){
         mainlist.add(list);
            if(q.isEmpty()) break;
              list=new ArrayList<>();
              q.offer(null);
            }
        
        else {
            list.add(front.val);
            if(front.left!=null) q.offer(front.left);
            if(front.right!=null) q.offer(front.right);
        }
        }

        return mainlist;
        }
        
    }
