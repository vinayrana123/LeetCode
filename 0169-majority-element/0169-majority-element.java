class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int majority = 0;

        for(int i=0;i<n;i++){
            if(count==0){
                count = 1;
                majority = nums[i];
            }else if(nums[i]==majority){
                count++;
            }else{
                count--;
            }
        }
    return majority;





        //brute force
    //     int n = nums.length;
    //      int mid=n/2;
    //  for(int i=0;i<n-1;i++){
    //     int appearance = 1;
    //     for(int j=i+1;j<n;j++){
    //         if(nums[i]==nums[j]){
    //             appearance++;
    //         }
    //     }
    //      if(appearance>mid){
    //    return nums[i];
    //  }
    //  }
    //   return -1;  
    }
}