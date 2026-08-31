class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int  answer = 0;
        for(int i=n-1;i>=2;i--){
        int a = nums[i];
        int b = nums[i-1];
        int c = nums[i-2];
        if(c+b>a){
            answer = a+b+c;
            return answer;
        }
    }
        return answer;
    }
}