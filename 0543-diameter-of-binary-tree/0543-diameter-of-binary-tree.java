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

// Approach 1
/*
class Solution {
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(rh,lh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        if(root==null){
            return 0;
        }
        
        int maxDiaOfLeft = diameterOfBinaryTree(root.left);
        int maxDiaOfRight = diameterOfBinaryTree(root.right);
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int maxdia = lh+rh;
        
        return Math.max(maxdia, Math.max(maxDiaOfLeft, maxDiaOfRight));
    }
}
*/

// Approach 2



class Solution {
    
    static class Pair{
		int dia;
		int height;

		Pair(){
			dia=0;
			height=0;
		}

		Pair(int h , int d){
			this.height = h;
			this.dia = d;
		}
	}
    
    public static Pair diameter_(TreeNode root) {
        // Your code here

		if(root==null){
			return new Pair();
		}

		Pair leftDia = diameter_(root.left);
		Pair rightDia = diameter_(root.right);

		int diaroots = leftDia.height + rightDia.height;
		int myHeight = Math.max(leftDia.height , rightDia.height)+1;

		int myDia = Math.max(diaroots, Math.max(leftDia.dia, rightDia.dia));

		return new Pair(myHeight,myDia);

	}


   
    public static int diameterOfBinaryTree(TreeNode root) {
        Pair ans = diameter_(root);
		return ans.dia;
        
       
    }
}

