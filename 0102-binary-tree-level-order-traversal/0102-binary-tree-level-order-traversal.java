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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> lo = new ArrayList<>();
        
        // if no root then return empty list
        if(root==null){
            return lo;
        }
        
        Queue<TreeNode> que = new ArrayDeque<>();
        
        //step 1 : Add root into Queue
        que.add(root);
        
        //step 2 : run till queue size > 0 
        while(que.size()>0){
            
            // Step 3 : Get size of queue
            int size = que.size();
            
            List<Integer> currentLevel = new ArrayList<>();
            
            while(size>0){
                
                // Step 4 : Remove front of the queue and children
                TreeNode removeNode = que.remove();
                
                // add remove node into the currrent level array
                currentLevel.add(removeNode.val);
                
                // Step 5 : if childrens are available add into the queue
                
                if(removeNode.left != null){
                    que.add(removeNode.left);
                }
                
                if(removeNode.right != null){
                    que.add(removeNode.right);
                }
                
                // decreasing size of level after removing the root
                size--;
            }
            
            // adding current level array into lo array list
            lo.add(currentLevel);
        }
        return lo;
        
    }
}