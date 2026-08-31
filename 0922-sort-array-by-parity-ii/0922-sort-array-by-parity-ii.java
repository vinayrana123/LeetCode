class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        for(int k=0;k<n;k++){
            if(nums[k]%2==0){
                 result[i] = nums[k];
                 i+=2;
            }else{
                result[j] = nums[k];
                j-=2;
            }
        }
        return result;
    }
}