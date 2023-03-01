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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> zigzag = new ArrayList<>();
        
        if(root==null){
            return zigzag;
        }
        
        Queue<TreeNode> que = new ArrayDeque<>();
        
        que.add(root);
        int level = 0;
        
        while(que.size()>0){
            
            int size = que.size();
            List <Integer> currlevel = new ArrayList<>();
            
            while(size>0){
                
                TreeNode rnode = que.remove();
                                
                currlevel.add(rnode.val);
                
                if(rnode.left != null){
                    que.add(rnode.left);
                }
                
                if(rnode.right != null){
                    que.add(rnode.right);
                }
                
                size--;
            }
            
            if(level % 2 == 0){
                zigzag.add(currlevel);
            }
            else{
                Collections.reverse(currlevel);
                zigzag.add(currlevel);
            }
            level--;
        }
        
        return zigzag;
    }
}