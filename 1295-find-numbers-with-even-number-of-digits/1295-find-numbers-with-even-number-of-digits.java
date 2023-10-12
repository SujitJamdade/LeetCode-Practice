class Solution {
    public int findNumbers(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        for(int i =0; i<n;i++){
            
            String digi = Integer.toString(nums[i]);
            int digiLength = digi.length();
            
            if(digiLength % 2 ==0 ){
                count++;
            }
            
        }
        return count;
    }
}