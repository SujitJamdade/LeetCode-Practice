class Solution {
    public boolean makeEqual(String[] words) {
        
        int word = words.length;
        int [] freq = new int[26];
        // HashMap<Character,Integer> freq = new HashMap<>();
        
        
        for(String i :words){
            for(char ch : i.toCharArray()){
                freq[ch-'a']++;
            }
        }
        
       
        
       for(int check : freq){
           if(check%word!=0){
               return false;
           }
          
       }
        return true;
    }
}