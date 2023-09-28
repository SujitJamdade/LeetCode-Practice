class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num: nums) {
            if (num <= firstSmallest) {
                firstSmallest = num;
            } else if (num <= secondSmallest) {
                secondSmallest = num;
            } else {
                return true;
            }
        }
        return false;
        
    }
}