import java.lang.Math;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int count =0;
        int unknown=0;
        for(int i =0;i<moves.length();i++){
            char c = moves.charAt(i);
            
            // Move towards left
            if(c == 'L'){
                count--;
            
            }
            
            //move towards right
            else if (c == 'R'){
                count++;

            }
            
            // Not sure where to move, increase unknown moves
            else{
                unknown ++;
            }
            
        }
        
        // check how much furthest without unknown take abs and add unknown count so we can get correct furthest
        return Math.abs(count)+unknown;       
        
    }
}