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
    public int sumNumbers(TreeNode root) {
        int sum = 0 ;
        List<Integer> list = new ArrayList<>() ;
        sumNumbers_edited(root, list, 0) ;
        for(int i = 0 ; i < list.size() ; i++ ){
            sum += list.get(i) ;
        }
        return sum ;
    }
    public void sumNumbers_edited(TreeNode root, List<Integer> list, int pathNum){
        if(root.left == null && root.right == null){
            list.add(pathNum*10 + root.val);
            return;
        }
        if(root.left != null){
            sumNumbers_edited(root.left, list, pathNum*10 + root.val);
        }
        if(root.right != null){
            sumNumbers_edited(root.right, list, pathNum*10 + root.val);
        }
    }
}