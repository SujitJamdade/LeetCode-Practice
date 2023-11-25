class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        int n= words.length;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i =0; i<n;i++){
            
            if(words[i].contains(x+"")){
                ans.add(i);
            }
        }
        
        return ans;
        
    }
}