class Solution {
    public int numIdenticalPairs(int[] nums) {
       
        
        // brute force Approach 
        // T = O(N^2)
        
        /*
        int n = nums.length;
        int count = 0;
        
        for(int i =0;i<n-1;i++){
            for(int j = i+1; j<n;j++){
                
                if(nums[i] == nums[j]) count++;
            }
        }
        
        return count;
        */
        
        // Now will try by Hash Map
        
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i =0;i<n;i++){
            
            if(map.containsKey(nums[i])){
                
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            else{
                map.put(nums[i],1);
            }         
        }
        
        for(int i : map.keySet()){
            // System.out.println(i + " " + map.get(i));
            int num = map.get(i);
            num = (num * (num-1))/2;
            count = count + num;
        }
        
        return count;
    }
}