class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
	   Arrays.sort(nums);
	   int i = 0;
	   int n = nums.length;
	   while(i<n){
		   int j = i+1;

		   while(j<n){
			   long remainingTarget = (long)(target - (long)nums[i] - (long)nums[j]);
                int l = j+1;
                int r = n-1;

                while(l<r){
                    long currSum = (long)(nums[l] + nums[r]);

					if(currSum==remainingTarget){
						List<Integer> curr= new ArrayList<>();
						curr.add(nums[i]);
						curr.add(nums[j]);
						curr.add(nums[l]);
						curr.add(nums[r]);
						res.add(curr);

						int prevL = nums[l];
						while(l<r && prevL == nums[l]) l++;

						int prevR = nums[r];
						while(l<r && prevR == nums[r]) r--;
					}
					else if (currSum<remainingTarget){
						int prevL = nums[l];
						while(l<r && prevL == nums[l]) l++;
					}
					else if (currSum>remainingTarget){
						int prevR = nums[r];
						while(l<r && prevR == nums[r]) r--;
					}
				}

			   int prevJ = nums[j];
			   while(j<n && prevJ==nums[j]) j++;
		   }

		   int prevI = nums[i];
		   while(i<n && prevI==nums[i]) i++;		   
	   }

	   return res;
        
    }
}