class Solution {
    public boolean isPalindrome(int x) {
        
        StringBuilder s = new StringBuilder(String.valueOf(x));
        
        s.reverse();
        
        return s.toString().equals(x+"");
        
    }
}