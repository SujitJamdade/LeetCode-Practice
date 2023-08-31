class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int end = -1;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0;i<nums.length;i++){
            
            max = Math.max(max,nums[i]);
            if(max>nums[i]) end=i;
            
        }
        
        if (end ==-1) return 0;
        
        
        int start = -1;
        int min = Integer.MAX_VALUE;
        
        for(int i = nums.length-1;i>=0;i--){
            
            min = Math.min(min,nums[i]);
            if(min<nums[i]) start=i;
            
        }
        
        return end-start+1;
    }
}