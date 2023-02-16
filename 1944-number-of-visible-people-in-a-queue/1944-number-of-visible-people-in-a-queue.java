class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        Stack<Integer>st = new Stack<>();
        int n = heights.length;
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){

            while(st.size()>0 && heights[st.peek()]<=heights[i]){
                arr[st.peek()]++;
                st.pop();
            }

            if(st.size()>0){
                 arr[st.peek()]++;
            }
            st.push(i);
        }

        // int maxscore =0;
        // int maxIdx =0;

        // for(int i =0; i<n;i++){
        //     if(arr[i]>maxscore){
        //         maxscore = arr[i];
        //         maxIdx = i;
        //     }
        // }
        return arr;
        
    }
}