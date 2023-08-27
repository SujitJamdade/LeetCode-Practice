import java.lang.Math;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int count =0;
        int unknown=0;
        for(int i =0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c == 'L'){
                count--;
            
            }
            else if (c == 'R'){
                count++;

            }
            else{
                unknown ++;
            }
            
        }
        
        return Math.abs(count)+unknown;       
        
    }
}