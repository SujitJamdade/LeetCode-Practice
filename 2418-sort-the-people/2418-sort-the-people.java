class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        ArrayList<Integer> a=new ArrayList<>();
        String b[]=new String[names.length];
        for(int i:heights)
        {
            a.add(i);
        }
        Arrays.sort(heights);
        int j=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            b[j++]=names[a.indexOf(heights[i])];            
        }
        return b;
        
    }
}