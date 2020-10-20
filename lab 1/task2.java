class Solution {
    
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int sum = Integer.MIN_VALUE;
        int flag = 0;
        
        for (int i = 0; i < nums.length; i++) {
            flag += nums[i]; 
            if (sum < flag) {
                sum = flag;
            }
            if (flag < 0){ 
                flag = 0;
            }
        }
        return sum;
    }
}
