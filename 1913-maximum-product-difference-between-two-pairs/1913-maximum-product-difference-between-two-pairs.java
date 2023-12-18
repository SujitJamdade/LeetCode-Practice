class Solution {
    public int maxProductDifference(int[] nums) {
        
        int n = nums.length;
        
        Arrays.sort(nums);
        int maxD=0;
        for(int i =0;i<n;i++){
            maxD = (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
            
        }
        return maxD;
    }
}