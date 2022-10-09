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
    Set<Integer> nums = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(null == root){
            return false;
        }
        
        if(nums.contains(k-root.val)){
            return true;
        }
        
        nums.add(root.val);
        
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}