class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int count = 0;
		
        for (String each : sentences) {
            int currLen = each.split(" ").length;
            // if (count < currLen)
            //     count = currLen;
            count = Math.max(count,currLen);
        }
        return count;
        
    }
}