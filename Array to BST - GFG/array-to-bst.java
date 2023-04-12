//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Node{
    int data;
    Node left, right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution
{
    
    public void constructPreorderBST(int[]nums, ArrayList<Integer> ans,int l, int r){
        
        if(l>r) return;
        
        int mid = (l+r)/2;
        
        Node me = new Node(nums[mid]);
        
        ans.add(me.data);
        
        constructPreorderBST(nums,ans,l,mid-1);
        constructPreorderBST(nums,ans,mid+1,r);
        
        
    }
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        ArrayList<Integer> ans = new ArrayList<>();
        constructPreorderBST(nums, ans, 0,nums.length-1);
        
        for(int i = 0; i<nums.length; i++){
            nums[i] = ans.get(i);
        }
        
        return nums;
        
    }
}