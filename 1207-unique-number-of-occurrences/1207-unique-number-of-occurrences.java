class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i :arr){
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        

        int [] ans = new int[map.size()];
        int j = 0;
        for(int v :map.values()){
            ans[j]=v;
            j++;
        }
        Arrays.sort(ans);
        
        for(int i =0;i<ans.length-1;i++){
            if(ans[i]==ans[i+1]){
                return false;
            }
        }
        return true;
        
    }
}