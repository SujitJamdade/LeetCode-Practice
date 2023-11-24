class Solution {
    
    public boolean isVowel(char c){
        
    
        switch(c){
        
                case ('a'):
                    return true;
                case ('e'):
                   return true;
                case ('i'):
                   return true;
                case ('o'):
                   return true;
                case ('u'):
                   return true;
                case ('A'):
                    return true;
                case ('E'):
                   return true;
                case ('I'):
                   return true;
                case ('O'):
                   return true;
                case ('U'):
                   return true;
                default:
                    return false;
        }
    }
    
    public String reverseVowels(String s) {
        
        StringBuilder ss =  new StringBuilder(s);
        int n = ss.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            
            char start = ss.charAt(i);
            char end = ss.charAt(j);
            
            /*
            
            String replace(char old, char new)	
            It replaces all occurrences of the specified char value.
            */
            
            if(isVowel(start) && isVowel(end)){
                
                ss.setCharAt(i,end);
                ss.setCharAt(j,start);
                
                i++;
                j--;
               
            }
            else if (!isVowel(start)){
                i++;
            }
            else if (!isVowel(end)){
                j--;
            }
        }
        return ss.toString();
    }
}