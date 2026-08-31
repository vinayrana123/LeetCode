class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int answer =1;
        for(int i=n-1;i>=n-3;i--){
            answer *= nums[i]; 
        }
        int answer1 = nums[0]*nums[1]*nums[n-1];
        return Math.max(answer,answer1);
    }
}