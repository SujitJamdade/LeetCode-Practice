class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
       
        int n = s.length();
        
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            
            int val = map.getOrDefault(c,0);
            map.put(c,val+1);
            
        }
        
        // System.out.println(map.toString());
        
        for(int i =0;i<n;i++){
            
            if(map.get(s.charAt(i))==1){
                return  i;
            }
        }
        return -1;
    }
}