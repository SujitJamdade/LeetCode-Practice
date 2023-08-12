class Solution {
    public int singleNumber(int[] nums) {
        
        for(int i = 0;i<nums.length;i++){
            
            int count = 1;
            for(int j = 0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                else if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
                
        }
     return 0;   
    }
}