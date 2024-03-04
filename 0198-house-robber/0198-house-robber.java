class Solution {
    public int rob(int[] nums) {
        int maxRobbery = 0;
        
        int lastRobbery = 0;
        int secondLastRobbery = 0;
        
        for(int currRobbery : nums){
            
            maxRobbery = Math.max(lastRobbery, secondLastRobbery+currRobbery);
            
            secondLastRobbery = lastRobbery;
            lastRobbery = maxRobbery;
        }
        
        return lastRobbery;
    }
}