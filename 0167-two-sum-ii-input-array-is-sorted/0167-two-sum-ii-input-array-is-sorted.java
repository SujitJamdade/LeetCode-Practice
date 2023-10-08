class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // 2 Pointer Approach
        
        // T = O(N) and S = O(1)
        
        // creating to point left as l and ringth as r
        int l = 0;
        int r = numbers.length-1;
        
        /*
        
        sum > target. Increasing left isn’t going to help us, as it makes the sum even bigger. Therefore we should decrement right.
 
        sum < target. Decreasing right isn’t going to help us, as it makes the sum even smaller. Therefore we should increment left.
        sum == target. We have found the answer.
        
        */
         while(l<r){
             
             // will take sum of them
            int sum = numbers[l]+numbers[r];
             
             if (sum<target){
                 l++;
             }
             else if (sum>target){
                 r--;
             }
             else{
                 return new int[] {l+1,r+1};
             }
         }  
        return new int[] {0,0};
    }
}