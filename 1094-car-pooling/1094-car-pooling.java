class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] station = new int[1001]; // 1001 due to constraints given 
        
        for(int[] trip : trips){
            int passenger = trip[0];
            int sp = trip[1];
            int ep = trip[2];
            
            station[sp] += passenger;
            station[ep] -= passenger;
        }
        
        // creating pref sum
        
        for(int i = 1; i<station.length; i++){
            station[i] += station[i-1];
        }
        
         for(int i = 0; i<station.length; i++){
            if(station[i] > capacity) return false;
        }
        
        return true;
    }
}