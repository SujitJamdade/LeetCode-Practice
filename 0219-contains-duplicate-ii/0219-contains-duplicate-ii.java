class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // we can use sliding window approach
        // considering k length arrray and checking the duplicate andd element in set if its not duplicate
        // if its found in th k length return true
        // if not found into that length then move the window by one index with k size 
        // we are moving index means we need to remove element index whoxh moved
        
        if(k==0) return false;
        
        Set<Integer> window = new HashSet();
        
        for(int i = 0; i<nums.length;i++){
            
            if(window.contains(nums[i])) return true;
            
            if(i>=k) window.remove(nums[i-k]);
            
            window.add(nums[i]);
        }
        
        return false;
    }
}