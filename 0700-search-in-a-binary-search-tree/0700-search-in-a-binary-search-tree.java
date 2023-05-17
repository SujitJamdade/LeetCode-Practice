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
    
    public TreeNode searchBST(TreeNode root, int val) {
        
        // if not root found in tree it should return as null
        if(root==null) return null;
       
        
        // if root found then return the root
        if(root.val == val) return root;
        
        // if root val is less than curr root then find in left tree
        else if (val < root.val ) return searchBST(root.left, val);
        
        // if root val is greater than curr root then find in right tree
        else return searchBST(root.right, val);
        
        }
}