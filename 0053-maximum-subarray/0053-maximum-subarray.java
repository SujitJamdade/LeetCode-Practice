class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int train = 0;
        int res = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            int prev = train + nums[i];
            int startNew = nums[i];

            train = Math.max(prev,startNew);
            res = Math.max(res,train);
        }
        return res;
    }
}