class Solution {
    public int[] plusOne(int[] digits) {
        
        // running loop from right digit to leftmost digit
        for(int i = digits.length-1; i>=0; i--){
            
            // checking last digit if its 9 or not 
            // its its less than 9 them simply we can puls one in last digit and return the array
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            
            // If digit is 9 then after adding one into that digit it should become '0'
            digits[i]=0;
        }
        
        // sample case 
        // if digit is 99 it will become 00 so we need to add 1 at leftmost place by increasing the array size
        // redeclaring new digits array by increasing size of existing array by 1
        digits = new int[digits.length+1];
        
        
        // placing 1 at leftmost place 
        digits[0]=1;
        return digits;
        
    }
}