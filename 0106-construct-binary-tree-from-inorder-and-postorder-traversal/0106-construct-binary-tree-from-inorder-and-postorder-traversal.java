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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for( int i = 0 ; i < inorder.length ; i++ ){
            map.put(inorder[i], i) ;
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map) ;
    }
    
    public TreeNode buildTree( int[] inorder, int si, int ei, int[] postorder, int sp, int ep, Map<Integer, Integer> map){
        if(sp > ep || si > ei) return null ;
        TreeNode root = new TreeNode(postorder[ep]) ;
        if(sp == ep) return root ;
        int locate_root = map.get(root.val) ;
        int numsLeft = locate_root - si ;
        TreeNode left = buildTree(inorder, si, locate_root - 1, postorder, sp, sp - 1 + numsLeft, map) ;
        TreeNode right = buildTree(inorder, locate_root + 1, ei, postorder, sp + numsLeft, ep - 1, map) ;
        root.left = left ;
        root.right = right ;
        return root ;
    }
}