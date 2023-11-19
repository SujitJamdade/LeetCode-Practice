class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        
        
        int a = s1.length();
        int b = s2.length();
        int c = s3.length();
        
        if(s1.charAt(0) != s2.charAt(0) || s2.charAt(0)!=s3.charAt(0)){
            return -1;
        }
        
        int i=0;
        int j = 0;
        int k = 0;
        
        while(i<a && j<b && k<c){
            
            if(s1.charAt(i) != s2.charAt(i) || s2.charAt(i)!=s3.charAt(i)){
                break;
            }
            i++;
            j++;
            k++;
        }
        
        return a-i+b-j+c-k;
        
    }
}