class Solution {
    public int maximumWealth(int[][] accounts) {
       int r = accounts.length;
        int c = accounts[0].length;
        
        int ans = 0;
        
        for(int i = 0; i<r; i++){
            int m = 0;
            for(int j = 0; j<c; j++){
                m = m+ accounts[i][j];
            }
            ans = Math.max(ans, m);
        }
        
        return ans;  
    }
}