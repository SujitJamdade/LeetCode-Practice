class Solution {
    
    public int trap(int[] arr) {
        
        // pre calculated array aaproach
        // using pre calculated array for left max and right max
        
        int n = arr.length;
        
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int water = 0;
        
        // storing left max into leftMax Array
        leftMax[0] = arr[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        
        // storing right max into rightMax Array
        rightMax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){ 
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
            
        }
        
        for(int i = 0;i<n;i++){
            
            water += Math.min(rightMax[i],leftMax[i]) - arr[i];
        }
        
        
        return water;
    }
}