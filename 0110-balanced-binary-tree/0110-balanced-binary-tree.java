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
    
    public int height(TreeNode root){
        
        if(root==null){
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight,rightHeight)+1;
    }
    
    
    public boolean isBalanced(TreeNode root) {
        
        if(root == null ){
            return true;
        }
        
        boolean leftBalance = isBalanced(root.left);
        
        boolean rightBalance = isBalanced(root.right);
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int diff = Math.abs(lh-rh);
         boolean selfBalance = false;
        
        if(diff<=1){
            selfBalance = true;
        }
    
        
        if(leftBalance == false || rightBalance == false ||  selfBalance == false ){
            return false;
        }
        else{
            return true;
        }
        
    }
}