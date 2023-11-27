class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        
        int merge [] = new int[m+n];
     
        
        int k = 0;
        for (int i = 0; i < n; i++) {
            merge[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merge[k++] = nums2[i];
        }

        // Sort the merge array.
        Arrays.sort(merge);
     
                
        if((m+n) % 2 ==1){
            int idx = (m+n)/2;
            return (double)(merge[idx]);
        }
        else{
    
            int idx = (m+n)/2;
            System.out.println("idx : "+idx);
            double ans = (double)(merge[idx]+merge[idx-1]) / (double)2;
        
            return ans;
        }
        
    }
}