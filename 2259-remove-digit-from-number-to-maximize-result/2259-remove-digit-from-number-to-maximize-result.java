class Solution {
    public String removeDigit(String number, char digit) {
        
        ArrayList<String> ans = new ArrayList<>();
        int n = number.length();
        
        for(int i = 0;i<n;i++){
            
            if(number.charAt(i)==(digit)){
                String s = number.substring(0,i)+number.substring(i+1);
                ans.add(s);
            }
        }
        
        Collections.sort(ans);
        
        return ans.get(ans.size()-1);
        
    }
}