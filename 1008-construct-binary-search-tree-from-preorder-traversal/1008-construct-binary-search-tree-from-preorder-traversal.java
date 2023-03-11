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
    public static int idx;
    
    public static TreeNode construct(int[] arr, int left, int right){
        
        if(idx==arr.length) return null;
        if(arr[idx]<left || arr[idx]>right) return null;
        
        int val = arr[idx];
        TreeNode me = new TreeNode(val);
        idx++;
        
        TreeNode leftTree= construct(arr, left,val-1);
        TreeNode rightTree = construct(arr,val+1, right);
        
        me.left = leftTree;
        me.right = rightTree;
        
        return me;       
        
    }
    
    public static TreeNode bstFromPreorder(int[] preorder) {
        
        idx = 0;
        TreeNode root = construct(preorder,Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
        
    }
}