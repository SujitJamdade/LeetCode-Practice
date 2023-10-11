class Solution {
    public String reverseWords(String s) {
        
        StringBuilder reversed = new StringBuilder();
        
         int j = s.length();
        
         for (int i = s.length() - 1; i >= 0; i--) {
             
             if (s.charAt(i) == ' '){    // space set to j so in substring we can use j as last index of word
                 j = i;
             }
             
             else if (i == 0 || s.charAt(i - 1) == ' ') {
                 
                 // if prev of i is space means currently we are on starting aplhabet of word
                 
                 if (reversed.length() != 0){    // if reversed string is empty then no need to add space 
                     reversed.append(' ');  // this appending space will helps to maintain single space between the words
                 }
                 
                 // when we finds the start index of aplha we can append the substring from i (start) index to j (end)
                 reversed.append(s.substring(i, j));
             }
         }
         return reversed.toString();
         
    }
}