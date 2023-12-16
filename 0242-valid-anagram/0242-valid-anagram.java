class Solution {
    public boolean isAnagram(String s, String t) {
        
        int [] ss = new int[26];
        
        
        if(s.length()==t.length()){
            
            for(int i=0;i<s.length();i++){
                
                ss[s.charAt(i)-'a'] ++;
                ss[t.charAt(i)-'a'] --;
            }
            
            for(int i:ss){
            
                if(i!=0){
                    return false;
                }
            }
            
            return true;
        }
        
        return false;
        
    }
}