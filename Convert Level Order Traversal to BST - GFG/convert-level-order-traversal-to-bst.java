//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Main {
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            GFG obj = new GFG();
            Node tree = obj.constructBST(arr);
            preorder(tree);
            System.out.println();
        }
	}
	
	 public static void preorder(Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}


// } Driver Code Ends


//User function Template for Java


class GFG 
{
    
    // creating public Pair class for parent to create parent node and define lower, uppper boundry
    public class Pair{
        Node parent;
        int lower;
        int upper;
        
        Pair(Node p, int l, int u){
            this.parent = p;
            this.lower = l;
            this.upper = u;
        }
    }
    
    
    
    //Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr)
    {
        //Write your code here 
        // creating queue of parent pair 
        Queue<Pair> q = new LinkedList<>();
        
        // starting from index 0 as root;
        Node root = new Node(arr[0]);
        
        // index 0 is root node so starting index from 1st 
        int idx = 1;
        
        // adding left and right pair of parent node
        q.add(new Pair(root,Integer.MIN_VALUE, root.data-1)); // added left pair
        q.add(new Pair(root,root.data+1, Integer.MAX_VALUE)); // added right pair
        
        while(q.size()>0){
            
            // remove first pair to check with idx element 
            Pair curr = q.remove();
            
            // we have to continue remove the pair from queue in below two cases.
            
            // 1. If idx reach to arr.length
            if(idx == arr.length) continue; // continue removing element from que;
            
            // 2. if idx element is not in the range of current pair lower and upper limit
            if(arr[idx] < curr.lower || arr[idx] > curr.upper) continue ; // It means idx element is not in the range of current pait limit
            
            // From here idx element is in the range pf pair limit
            // create child node from idx element
            Node me = new Node(arr[idx]);
            
            if(arr[idx] < curr.parent.data) {
                // it means idx element is smaller than parent node value then add it to left tree
                curr.parent.left = me;
            }
            else{
                 // it means idx element is greater than parent node value then add it to right tree
                curr.parent.right = me;
            }
            
            // child node added successfully to parent node, so we can increase idx
            idx++;
            
            // now child can also be potential parent for future child node, so add potentail pair 
            q.add(new Pair(me,curr.lower, me.data-1));
            q.add(new Pair(me, me.data+1, curr.upper));
            
        }
        
        return root;
        
    }
}