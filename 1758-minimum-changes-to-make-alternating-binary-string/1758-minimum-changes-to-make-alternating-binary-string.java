class Solution {
    
    
    public int minOperations(String s) {
        char c_0 = s.charAt(0);
        int count1 = count(s, c_0);
        int count2 = count(s, c_0=='0'?'1':'0')+1;
        return Math.min(count1, count2);
    }

    private int count(String s, char c_pre){
        int count = 0;
        for(int i=1; i<s.length(); i++){
            char current = s.charAt(i);
            if(current==c_pre){
                count++;
                c_pre = c_pre == '0' ? '1' : '0';
            }else{
                c_pre = current;   
            }
        }
        return count;
    }
    
//     public int minOperations(String s) {
        
//         int n = s.length();
//         StringBuilder ss = new StringBuilder(s);
        
//         int count = 0;
    
            
//         for(int i =1;i<n;i++){
            
//             if(ss.charAt(i-1)!=ss.charAt(i)){
//                 continue;
//             }
//             else{
//                 if(ss.charAt(i)=='0'){
//                     ss.setCharAt(i,'1');
//                 }
//                 else{
//                     ss.setCharAt(i,'0');
//                 }
//                 count++;
//             }
//         }
        
//         return count;
//     }
}