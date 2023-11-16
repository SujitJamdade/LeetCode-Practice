class Solution {
    public String addStrings(String num1, String num2) {
        
        int s1 = num1.length()-1;
        int s2 = num2.length()-1;
        
        StringBuilder s = new StringBuilder();
        
        int sum = 0;
        int carry = 0;
        
        while(s1>=0 || s2>=0|| carry>0){
            
            int d1 = 0;
            int d2 = 0;
            
            if(s1>=0){
                d1 = num1.charAt(s1)-'0';
                s1--;
            }
            
            if(s2>=0){
                d2 = num2.charAt(s2)-'0';
                s2--;
            }
            
            sum = carry+d1+d2;
            s.append(sum%10);
            carry= sum/10;
            
        }
        
        return s.reverse().toString();       
        
        
    }
}