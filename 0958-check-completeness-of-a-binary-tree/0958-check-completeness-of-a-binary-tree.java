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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>() ;
        q.add(root) ;
        
        while(!q.isEmpty()){
            TreeNode root_e = q.poll() ;
            if(root_e == null){
                while(!q.isEmpty()){
                    TreeNode g = q.poll() ;
                    if(g != null) return false;
                }
                return true ;
            }
            q.add(root_e.left) ;
            q.add(root_e.right) ;
        }
        
        return true ;
    }
}