class Solution {
    public int maxSubArray(int[] nums) {
        int CurrentSum = 0;
        int maxSum = nums[0];
        for(int val : nums){
            CurrentSum += val;
            maxSum = Math.max(CurrentSum,maxSum);
            if(CurrentSum<0){
                CurrentSum=0;
            }
        }
        return maxSum;
    }
}