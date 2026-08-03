class Solution {
    public int singleNonDuplicate(int[] nums) {
     //approach 1 xor kar lo sbka
     int n = nums.length;

     int xor = 0;
    for(int i=0;i<n;i++){
        xor = xor^nums[i];
    }
    return xor;
    }
}