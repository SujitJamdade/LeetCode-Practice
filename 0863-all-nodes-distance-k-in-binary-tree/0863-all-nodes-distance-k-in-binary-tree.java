/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        findParent(root, parent);
        
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(target);
        
        HashSet<TreeNode> visit = new HashSet<>();
        visit.add(target);
        
        List<Integer> list = new ArrayList<>();
        
        
        while(que.size()>0){
            int size = que.size();
            
            if(k==0){
                 while(que.size()>0){
                    list.add(que.remove().val);
                 }
                return list;
            }
            
            while(size>0){
                
                TreeNode rnode = que.remove();
                
                // left child is there or not and it should not already visited parent
                if(rnode.left != null && visit.contains(rnode.left) == false){
                    visit.add(rnode.left);
                    que.add(rnode.left);
                }
                
                 // right child is there or not and it should not already visited parent
                if(rnode.right != null && visit.contains(rnode.right) == false){
                    visit.add(rnode.right);
                    que.add(rnode.right);
                }
                
                // parent node 
                
                if(parent.getOrDefault(rnode, null) != null && visit.contains(parent.get(rnode)) == false){
                    visit.add(parent.get(rnode));
                    que.add(parent.get(rnode));
                }
                
                size--;
            }
            
            k--;      
        }
        
        return list;
        
    }
    
    void findParent(TreeNode root, HashMap<TreeNode, TreeNode> parent){
        
        if(root==null){
            return;
        }
        
        // left child
        if(root.left != null){
            parent.put(root.left, root);
        }
        
        // right child
        if(root.right != null){
            parent.put(root.right, root);
        }
        
        findParent(root.left, parent);
        findParent(root.right, parent);
    }
}