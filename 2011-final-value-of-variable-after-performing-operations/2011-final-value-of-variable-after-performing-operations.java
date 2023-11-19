class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int X = 0;
        for(String str : operations){
            
            if(str.equals("--X") || str.equals("X--")){
                
                X = X-1;
            }
            else if(str.equals("++X") || str.equals("X++")){
                 X = X+1;
            }
//              else if(str.equals("X--")){
                
//             }
//             else if(str.equals("X++")){
                
//             }
            
        }
        
        return X;
        
    }
}