// recheck

class Solution {
    public int maxLengthBetweenEqualCharacters(String ss) {
        int ans = -1;
        StringBuilder s = new StringBuilder(ss);
        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right < s.length(); right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    ans = Math.max(ans, right - left - 1);
                }
            }
        }
        
        return ans;
    }
}