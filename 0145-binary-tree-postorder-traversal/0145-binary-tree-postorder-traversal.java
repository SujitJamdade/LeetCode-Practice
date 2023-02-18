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
    
    public static void postTraversal(TreeNode root, ArrayList<Integer> arr){
        
        // checking for null to return back
        if(root==null){
            return;
        }
        
        postTraversal(root.left,arr);
        
        postTraversal(root.right,arr);
        
        arr.add(root.val);
        
        
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        postTraversal(root,arr);
        
        return arr;
    }
}