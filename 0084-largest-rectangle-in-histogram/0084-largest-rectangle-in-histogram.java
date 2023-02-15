class Solution {

    public int[] leftSmall(int [] arr , int n){

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];

        for(int i = n-1; i>=0; i--){

            while(st.size()>0 && arr[i]<arr[st.peek()]){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

        while(st.size()>0){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;

    }

    public int[] rightSmall(int [] arr , int n){

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];

        for(int i = 0; i<n; i++){

            while(st.size()>0 && arr[i]<arr[st.peek()]){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

        while(st.size()>0){
            ans[st.peek()] = n;
            st.pop();
        }
        return ans;

    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        // finding small rectangle at left
        int l[] = leftSmall(heights,n);
        // finding small rectangle at right
        int r[] = rightSmall(heights,n);

        int largeHisto = 0;

        for(int i = 0; i<n; i++){

            int area= heights[i] * (r[i] - l[i] - 1);
            largeHisto = Math.max(largeHisto, area); 
        }

        return largeHisto;

    }
}