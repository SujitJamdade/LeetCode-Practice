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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> rv = new ArrayList<>();
        
        if(root == null){
            return rv;
        }
        
        Queue<TreeNode> que = new ArrayDeque<>();
        
        //1. add root into que
        que.add(root);
        
        //2. check the size of queue, work till size is greater than 0
        
        while(que.size()>0){
            
            //3. get the size of queue
            int size = que.size();
            
            while(size>0){
                
                TreeNode rnode = que.remove();
                
                if(size==1){
                    rv.add(rnode.val);
                }
                
                if(rnode.left != null){
                    que.add(rnode.left);
                }
                
                if(rnode.right != null){
                    que.add(rnode.right);
                }
                
                size--;
            }
        }
        return rv;
        
    }
}