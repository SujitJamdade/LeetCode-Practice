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
    
    public static void ioTraversal(TreeNode root, ArrayList<Integer> arr){
        
        if(root==null){
            return ;
        }
        
        ioTraversal(root.left,arr);
        // System.out.print(root.val+" ");
        arr.add(root.val);
         ioTraversal(root.right,arr);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList <Integer> arr = new ArrayList<>();
        
        ioTraversal(root, arr);
        
        return arr;
        
    }
}