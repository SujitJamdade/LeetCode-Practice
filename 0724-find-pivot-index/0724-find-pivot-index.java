class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
		int[] pref = new int[n];
		pref[0] = nums[0];

		for(int i = 1; i<n;i++){
			pref[i] = nums[i] + pref[i-1];
		}

		for(int i = 0; i<n;i++){
			
			int leftSum = i==0 ? 0 : pref[i-1];
			int rightSum = i==n-1 ? 0 : pref[n-1] - pref[i];

			if(leftSum ==rightSum) return i;
		}

		return -1;
        
    }
}