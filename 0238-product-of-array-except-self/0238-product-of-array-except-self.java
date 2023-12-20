class Solution {
    public int[] productExceptSelf(int[] nums) {
        

        int n = nums.length;
        
        int[] ans = new int[n];
        int prevPro =1;
        int postPro = 1;
        
        for(int i=0;i<n;i++){
            ans[i] = prevPro;
            prevPro*=nums[i];
         }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(ans));
        
        for(int i = n-1;i>=0;i--){
            ans[i] *=postPro;
            postPro*=nums[i];
        }
        
        return ans;
    }
}