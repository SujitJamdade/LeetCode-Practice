class Solution {
    
    public int numSpecial(int[][] mat) {
        
        int specials = 0;

        for (int i = 0; i < mat.length; i++) {
            int index = checkRow(mat, i);
            if (index >= 0 && checkColumn(mat, i, index))
                specials++;
        }

        return specials;
    }

    private int checkRow(int[][] mat, int i) {
        int index = -1;
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j] == 1) {
                if (index >= 0)
                    return -1;
                else
                    index = j;
            }
        }
        return index;
    }

    private boolean checkColumn(int[][] mat, int i, int index) {
        for (int j = 0; j < mat.length; j++) {
            if (mat[j][index] == 1 && j != i)
                return false;
        }
        return true;
    }
    
}

/*
class Solution {
    public int numSpecial(int[][] mat) {
 
        
        // int [] arr = new int[10];
        
        // int n = arr.length;
        
        int row = mat.length;
        int col = mat[0].length;
        int count = 0;
        for(int i = 0;i<row;i++){
            
            for(int j = 0;j<col;j++){
                
                if(mat[i][j]==1){
                    
                    int check = 0;
                    for(int rowStart = 0;rowStart<col;rowStart++){
                        
                        if(rowStart ==j){
                            continue;
                        }
                        else if(mat[i][rowStart] == 0){
                            check = 1;
                        }
                        else {
                            check =0;
                        }
                    }
                    
                     for(int colStart = 0;colStart<row;colStart++){
                        
                        if(colStart ==i){
                            continue;
                        }
                        else if(mat[colStart][j] == 0){
                            check = 1;
                        }
                        else {
                            check =0;
                        }
                         
                    }
                    
                     if(check ==1){
                        count++;
                         
                    }
                    
                    
                }  
                      
            }
        }
        return count;
    }
}
*/