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
    public int kthSmallest(TreeNode root, int k) {
        
        // creating arraylist to store inorder element
        ArrayList<Integer> arr = new ArrayList<>();
        
        // calling inorder function
        InOrder( root,arr );
        return arr.get(k-1);
        
        
        
    }
    
    void InOrder(TreeNode root,ArrayList<Integer> arr ){
        
        if(root==null) return;
        
        InOrder( root.left,arr );
        // adding val into arraylist to get inorder arr
        arr.add(root.val);
        
        InOrder( root.right,arr );
        
        
    }
}