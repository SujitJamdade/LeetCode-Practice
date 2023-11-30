class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int n = s.length();
        
        for(int i = 0;i<n;i++){
            
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c,val+1);
                
                if(map.get(c)==2){
                    return c;
                }
            }
            else {
                map.put(c,1);
            }
            
        }
        
        return 'a';
        
        
    }
}