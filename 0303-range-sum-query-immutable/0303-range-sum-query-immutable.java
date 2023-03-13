class NumArray {
    
    int nums[];

    public NumArray(int[] nums) {
        
        int n = nums.length;
        
        for(int i = 1; i<n; i++){
            nums[i] += nums[i-1];
        }
        this.nums = nums;
        
    }
    
    public int sumRange(int left, int right) {
        
        if(left==0){
            return nums[right];
        }
        else{
            return nums[right]-nums[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */