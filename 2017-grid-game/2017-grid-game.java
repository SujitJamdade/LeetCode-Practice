class Solution {
    public long gridGame(int[][] grid) {
        
        int n = grid[0].length;
		long[] suffRow0 = new long[n];
		long[] prefRow1 = new long[n];
		
		prefRow1[0] = grid[1][0];
		for(int i = 1; i<n;i++){
			prefRow1[i] = prefRow1[i-1] + grid[1][i];
		}

		suffRow0[n-1] = grid[0][n-1];
		for(int i = n-2; i>=0; i--){
			suffRow0[i] = suffRow0[i+1] + grid[0][i];
		}

		//now we have to consider the minimum possible sum
		//robot 2 can make out of all of the choices robot 1 can make
		//if robot 2 chooses best choice
		// long res = Integer.MAX_VALUE;
        long res=Math.min(prefRow1[n-1],suffRow0[0]);

		for(int i = 0;i<n;i++){
			//robot 1 will be switching rows on the ith column
			//robot 2 is left with 2 choices

			long choice1 = i==n-1 ? 0 : suffRow0[i+1];
			long choice2 = i==0 ? 0 : prefRow1[i-1];

			long robot2 = Math.max(choice1, choice2);

			res = Math.min(res, robot2);
		}
		return res;
        
    }
}