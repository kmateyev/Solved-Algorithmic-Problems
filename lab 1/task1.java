class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        this.arr = nums;
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }
}
